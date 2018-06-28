package com.hjrz.shiro.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RoleFilter extends AccessControlFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        String [] rolearr = (String[]) o;

        Subject subject = getSubject(servletRequest, servletResponse);
        for(String role : rolearr)
        {
            if(subject.hasRole("role:"+role)){return true;}
        }
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        Subject subject = getSubject(servletRequest, servletResponse);
        if(subject.getPrincipal() == null)
        {
            saveRequest(servletRequest);
            WebUtils.issueRedirect(servletRequest, servletResponse,"/login");
        }
        return false;
    }
}
