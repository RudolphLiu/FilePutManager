package com.hjrz.shiro;

import com.hjrz.entity.Fu_user;
import com.hjrz.service.UserService;
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

    /*
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userprincipal = principals.toString();
        System.out.println("User = ::"+userprincipal);
        Set<String> roleNames = new HashSet<String>();
        Set<String> permissions = new HashSet<String>();
        roleNames.add("user");//添加角色
        if(userprincipal.equals("liuzibing"))
        {
            roleNames.add("admin");
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roleNames);
        info.setStringPermissions(permissions);
        return info;
    }

    /*
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String username = token.getPrincipal().toString();
        Fu_user fuUser = userService.selectByUserName(username);
        if(fuUser != null)
        {
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(fuUser.getFu_username(),fuUser.getFu_password(),getName());
            return authenticationInfo;
        }
        else{
            throw new AuthenticationException("登录失败");
        }
    }

}
