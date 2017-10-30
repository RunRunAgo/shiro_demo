package com.hlxd.glhdcs.util;

import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.shiro.realm.SampleRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;


/**
 * <p>
 * <p>
 * <p>
 * <p>
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2014年3月3日 　<br/>
 * <p>
 *
 * @author zhou-baicheng
 * @version 1.0, 2014年3月3日
 * <p>
 * Shiro管理下的Token工具类
 */
public class TokenManager {
    /**
     * 用户登录管理
     */

    public static final SampleRealm realm = SpringContextUtil.getBean("sampleRealm", SampleRealm.class);

    /**
     * 获取当前登录的用户TEmployeeMapper对象
     *
     * @return
     */
    public static TEmployee getToken() {
        TEmployee token = (TEmployee) SecurityUtils.getSubject().getPrincipal();
        return token;
    }

    /**
     * 获取当前用户的Session
     *
     * @return
     */
    public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }

    /**
     * 获取当前用户NAME
     *
     * @return
     */
    public static String getNickname() {
        return getToken().getEmployeeName();
    }

    /**
     * 获取当前用户ID
     *
     * @return
     */
    public static String getUserId() {
        return getToken() == null ? null : getToken().getIuid();
    }

    /**
     * 把值放入到当前登录用户的Session里
     *
     * @param key
     * @param value
     */
    public static void setVal2Session(Object key, Object value) {
        getSession().setAttribute(key, value);
    }

    /**
     * 从当前登录用户的Session里取值
     *
     * @param key
     * @return
     */
    public static Object getVal2Session(Object key) {
        return getSession().getAttribute(key);
    }

    /**
     * 获取验证码，获取一次后删除
     *
     * @return
     */
    public static String getYZM() {
        String code = (String) getSession().getAttribute("CODE");
        getSession().removeAttribute("CODE");
        return code;
    }


    /**
     * 登录
     *
     * @param user
     * @param rememberMe
     * @return
     */
    public static TEmployee login(TEmployee user, Boolean rememberMe) {
        UsernamePasswordToken token = new UsernamePasswordToken(user.getStaffFlag(), user.getPwd());
        token.setRememberMe(rememberMe);
        SecurityUtils.getSubject().login(token);
        return getToken();
    }


    /**
     * 判断是否登录
     *
     * @return
     */
    public static boolean isLogin() {
        return null != SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 退出登录
     */
    public static void logout() {
        SecurityUtils.getSubject().logout();
    }


}
