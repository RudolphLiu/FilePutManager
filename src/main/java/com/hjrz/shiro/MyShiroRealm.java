package com.hjrz.shiro;

import com.hjrz.constants.UserStateEnum;
import com.hjrz.entity.Fu_user;
import com.hjrz.service.RoleService;
import com.hjrz.service.UserService;
import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;
    /*
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Long userid = TokenManager.getUserId();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roles = roleService.SelectRolesByUserID(userid);
        info.setRoles(roles);
        return info;
    }

    /*
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        ShiroToken token = (ShiroToken) authcToken;
        Fu_user fuUser = userService.userlogin(token.getUsername(), token.getPswd());
        if (fuUser == null) {
            throw new AuthenticationException("登录失败，用户名或密码不正确");
        }
        if (fuUser.getFu_state().equals(UserStateEnum.PROHIBITED)) {
            throw new AuthenticationException("登录失败，当前用户已被禁止使用");
        }
        return new SimpleAuthenticationInfo(fuUser,fuUser.getFu_password(), getName());
    }


}
