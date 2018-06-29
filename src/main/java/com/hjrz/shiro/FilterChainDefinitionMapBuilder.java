package com.hjrz.shiro;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder{

    public LinkedHashMap<String,String> buildFilterChainDefinitionMap()
    {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
             map.put("/login","anon");
             map.put("/tosignform","anon");
             map.put("/signin","anon");
             map.put("/signinwithuser","anon");
             map.put("/shiro/logout","logout");

             map.put("/checkLogin","anon");

             map.put("/adminpage","role[admin]");
             map.put("/adminstrative","role[admin]");
             map.put("/fileupload","role[admin]");
             map.put("/sales","role[admin]");
             map.put("/userpage","role[user]");


             map.put("/**","authc");
        return map;
    }
}
