package com.hlxd.glhdcs.controller;

import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.service.SolutionService;
import com.hlxd.glhdcs.util.TokenManager;
import org.apache.shiro.authc.DisabledAccountException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
    protected Map<String, Object> resultMap = new LinkedHashMap<String, Object>();

    @Resource
    private SolutionService solutionService;

    /**
     * y用户登录
     *
     * @return
     */
    @RequestMapping("login")
    public String userLogin() {
        return "index";
    }

    /**
     * 登录提交
     *
     * @param entity     登录的UUser
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
