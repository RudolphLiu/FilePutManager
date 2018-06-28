package com.hjrz.shiro;

import  org.apache.shiro.authc.UsernamePasswordToken;

import java.io.Serializable;

public class ShiroToken extends UsernamePasswordToken implements Serializable{

    private static final long serialVersionUID = 2485549467435521959L;

    public ShiroToken(String username, String pswd) {
        super(username,pswd);
        this.pswd = pswd ;
    }

    /** 登录密码[字符串类型] 因为父类是char[] ] **/
    private String pswd ;

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
