package com.hjrz.shiro;

import com.hjrz.entity.Fu_user;
import com.hjrz.util.SpringContextUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;


public class TokenManager {

    //用户登录管理
    public static final MyShiroRealm realm = SpringContextUtil.getBean("myShiroRealm",MyShiroRealm.class);


    //获取当前登录用户对象
    public static Fu_user getToken()
    {
        Fu_user user = (Fu_user) SecurityUtils.getSubject().getPrincipal();
        return user;
    }

    /**
     * 登录
     * @param user
     * @param rememberMe
     * @return
     */
    public static Fu_user login(Fu_user user,Boolean rememberMe){
        ShiroToken token = new ShiroToken(user.getFu_username(),user.getFu_password());
        token.setRememberMe(rememberMe);
        SecurityUtils.getSubject().login(token);
        return getToken();
    }

    public static Fu_user login(String username,String password,Boolean rememberMe)
    {
        ShiroToken token = new ShiroToken(username,password);
        token.setRememberMe(rememberMe);
        SecurityUtils.getSubject().login(token);
        return getToken();
    }

    //判断用户是否登录
    public static boolean isLogin() {
        Subject subject =SecurityUtils.getSubject();
        return subject.getPrincipal() != null && subject.isAuthenticated();
    }

    //退出登录
    public static void logout() {
        SecurityUtils.getSubject().logout();
    }


    //获取当前用户session
    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }

    //获取当前用户真实姓名
    public static String getNickname(){
        return getToken().getFu_realname();
    }

    //获取当前用户ID
    public static Long getUserId(){
        return getToken()==null?null:getToken().getFu_user_id();
    }

    //把值放入当前用户session中去
    public static void setVal2Session(Object key ,Object value){
        getSession().setAttribute(key, value);
    }

    //从当前用户session中取值
    public static Object getVal2Session(Object key){
        return getSession().getAttribute(key);
    }
}
