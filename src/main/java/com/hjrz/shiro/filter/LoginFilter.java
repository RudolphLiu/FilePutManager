package com.hjrz.shiro.filter;

import com.hjrz.entity.Fu_user;
import com.hjrz.shiro.TokenManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter extends AccessControlFilter {
    private String loginUrl = "/login";
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        Fu_user token = TokenManager.getToken();
        System.out.println(isLoginRequest(request,response));
        if(token != null)
        {
            return Boolean.TRUE;
        }
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        if (subject.getPrincipal() == null){
            //保存Request和Response 到登录后的链接
            saveRequestAndRedirectToLogin(request, response);
            WebUtils.issueRedirect(request, response, loginUrl);
        }
        System.out.println("访问拒绝也不自己处理，继续拦截器链的执行");
        return false;
    }
}
