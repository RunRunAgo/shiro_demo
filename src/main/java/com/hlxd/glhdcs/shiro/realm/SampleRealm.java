package com.hlxd.glhdcs.shiro.realm;

import com.hlxd.glhdcs.pojo.TEmployee;
import com.hlxd.glhdcs.service.TEmployeeService;
import com.hlxd.glhdcs.util.TokenManager;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * shiro 认证 + 授权   重写
 */
@SuppressWarnings("ALL")
public class SampleRealm extends AuthorizingRealm {

    @Autowired
    TEmployeeService tEmployeeService;

    public SampleRealm() {
        super();
    }

    /**
     * 认证信息，主要针对用户登录，
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        TEmployee user = tEmployeeService.login(token.getUsername(), token.getPassword());
        if (null == user) {
            throw new AccountException("帐号或密码不正确！");
            /**
             * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
             */
        } else {
            //更新登录时间 last login time
     /*       user.setLastLoginTime(new Date());
            tEmployeeService.updateByPrimaryKeySelective(user);*/
        }
        return new SimpleAuthenticationInfo(user, user.getPwd(), getName());
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        String userId = TokenManager.getUserId();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //根据用户ID查询角色（role），放入到Authorization里。
/*        Set<String> roles = roleService.findRoleByUserId(userId);
        info.setRoles(roles);
        //根据用户ID查询权限（permission），放入到Authorization里。
        Set<String> permissions = permissionService.findPermissionByUserId(userId);
        info.setStringPermissions(permissions);*/
        return null;
    }
}
