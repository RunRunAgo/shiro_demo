package com.hlxd.glhdcs.controller;

import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.shiro.realm.ShiroToken;
import com.hlxd.glhdcs.util.MyMd5;
import com.hlxd.glhdcs.util.TokenManager;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shiro登录
 *
 * @author RunRunAgo
 */
@Controller
@Scope("prototype")
@RequestMapping("shiro")
public class LoginController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected Map<String, Object> resultMap = new LinkedHashMap<String, Object>();


    /**
     * 登录校验
     *
     * @param username           用户名
     * @param password           密码
     * @param request
     * @param redirectAttributes
     * @return 重定向到主页
     */
    @RequestMapping("/userlogin")
    public String  loginCheck(@RequestParam("username") String username, @RequestParam("password") String password,
                                   HttpServletRequest request, RedirectAttributes redirectAttributes) {
        logger.info("用户登录");
        String msg = "";

        Subject subject = SecurityUtils.getSubject();
        /**
         * 登录令牌校验,密码加密
         */
        ShiroToken token = new ShiroToken(username, MyMd5.md5(password));

        try {
            subject.login(token);

           return "jsp/index";
        } catch (IncorrectCredentialsException e) {
            msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
            resultMap.put("status", 500);
            resultMap.put("message", "登录密码错误");
            System.out.println(msg);
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败次数过多";
            resultMap.put("status", 500);
            resultMap.put("message", "登录失败次数过多");
            System.out.println(msg);
        } catch (LockedAccountException e) {
            msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
            resultMap.put("status", 500);
            resultMap.put("message", "帐号已被锁定");
            System.out.println(msg);
        } catch (DisabledAccountException e) {
            msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
            resultMap.put("status", 500);
            resultMap.put("message", "帐号已被禁用");
            System.out.println(msg);
        } catch (ExpiredCredentialsException e) {
            msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
            resultMap.put("status", 500);
            resultMap.put("message", "帐号已过期");
            System.out.println(msg);
        } catch (UnknownAccountException e) {
            msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
            resultMap.put("status", 500);
            resultMap.put("message", "帐号不存在");
            System.out.println(msg);
        } catch (UnauthorizedException e) {
            msg = "您没有得到相应的授权！" + e.getMessage();
            resultMap.put("status", 500);
            resultMap.put("message", "您没有得到相应的授权");
            System.out.println(msg);
        }
        redirectAttributes.addFlashAttribute("error",msg);
        return "login";

    }

    /**
     * 登录(方式二),有需求再选择
     *
     * @param entity     登录的
     * @param rememberMe 是否记住
     * @param request    request，用来取登录之前Url地址，用来登录后跳转到没有登录之前的页面。
     * @return
     */
    @RequestMapping(value = "submitLogin", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> submitLogin(TEmployee entity, Boolean rememberMe, HttpServletRequest request) {

        try {
            entity = TokenManager.login(entity, rememberMe);
            resultMap.put("status", 200);
            resultMap.put("message", "登录成功");
/**
 * 这里其实可以直接catch Exception，然后抛出 message即可，但是最好还是各种明细catch 好点。。
 */
        } catch (DisabledAccountException e) {
            resultMap.put("status", 500);
            resultMap.put("message", "帐号已经禁用。");
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "帐号或密码错误");
        }

        return resultMap;
    }
}
