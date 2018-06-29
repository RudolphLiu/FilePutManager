package com.hjrz.shiro.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RoleFilter extends AccessControlFilter {

    static final String UNAUTHORIZED_URL = "unauthorized";

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object o) throws Exception {
        String [] rolearr = (String[]) o;

        Subject subject = getSubject(request,response);
        for(String role : rolearr)
        {
            if(subject.hasRole(role)){
                return true;}
        }
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request,response);
        setLoginUrl("/login");
        if(subject.getPrincipal() == null)
        {
            saveRequest(request);
            WebUtils.issueRedirect(request,response,"/login");
        }
        else{
            HttpServletRequest httpRequest = ((HttpServletRequest)request);
            if (org.apache.shiro.util.StringUtils.hasText(UNAUTHORIZED_URL)){
                WebUtils.getPathWithinApplication(httpRequest);
                WebUtils.issueRedirect(request, response, UNAUTHORIZED_URL);
            }else {//否则返回401未授权状态码
                WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
            }
        }
        return false;
    }
}
