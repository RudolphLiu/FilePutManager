package com.hjrz.shiro.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter extends AccessControlFilter {
    private String loginUrl = "/login";
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        System.out.println("access allowed");
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        if (subject.getPrincipal() == null){
            saveRequest(request);
            WebUtils.issueRedirect(request, response, loginUrl);
        }
        System.out.println("访问拒绝也不自己处理，继续拦截器链的执行");
        return false;
    }
}
