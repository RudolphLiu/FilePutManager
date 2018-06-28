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

            map.put("/adminpage","role");
            map.put("/userpage","role");

             map.put("/**","authc");
        return map;
    }
}
