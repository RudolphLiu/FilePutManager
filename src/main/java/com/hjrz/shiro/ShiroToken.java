package com.hjrz.shiro;

import  org.apache.shiro.authc.UsernamePasswordToken;

import java.io.Serializable;

public class ShiroToken extends UsernamePasswordToken implements Serializable{

    private static final long serialVersionUID = 8807759798359732230L;

    public ShiroToken(String username, String pwd) {
        super(username, pwd);
        this.pwd = pwd;
    }

    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
