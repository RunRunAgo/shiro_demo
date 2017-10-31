package com.hlxd.glhdcs.shiro.realm;

import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.service.TEmployeeService;
import com.hlxd.glhdcs.service.TRRoleService;
import com.hlxd.glhdcs.util.TokenManager;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;


/**
 * shiro 认证 + 授权   重写
 */
@SuppressWarnings("ALL")
public class SampleRealm extends AuthorizingRealm {

    @Autowired
    TEmployeeService tEmployeeService;
    @Autowired
    TRRoleService tRRoleService;
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public SampleRealm() {
        super();
    }

    /**
     * 认证信息，主要针对用户登录，
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        logger.info("认证......");
        ShiroToken token = (ShiroToken) authcToken;
        TEmployee user = tEmployeeService.login(token.getUsername(), token.getPswd());
        SimpleAuthenticationInfo info = null;
        /**
         *将数据库中的密码交给shiro
         */
        if (null != user) {
            info = new SimpleAuthenticationInfo(user, user.getPwd(), getName());
            /**
             * 将用户信息存入session
             */
            SecurityUtils.getSubject().getSession().setAttribute("user", user);

        }
        return info;
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("授权......");
        TEmployee user = (TEmployee) SecurityUtils.getSubject().getSession().getAttribute("user");
        /**
         * 根据员工编码查询用户角色,放入到Authorization里
         */
        String employeeCode = user.getEmployeeCode();
        Set<String> roles = tRRoleService.findRoleByEmployeeCode(employeeCode);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles);
        //根据用户ID查询权限（permission），放入到Authorization里。
       /* Set<String> permissions = permissionService.findPermissionByUserId(userId);
        info.setStringPermissions(permissions);*/
        return info;
    }
}
