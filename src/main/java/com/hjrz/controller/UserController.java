package com.hjrz.controller;

import com.hjrz.data.ExchangeData;
import com.hjrz.entity.Fu_user;
import com.hjrz.pojo.Signin;
import com.hjrz.service.UserService;
import com.hjrz.shiro.ShiroToken;
import com.hjrz.shiro.TokenManager;
import com.hjrz.util.EncryptUtil;
import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@Scope(value="prototype")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/signform")
    public String tosignin()
    {
        return "signform";
    }


    @RequestMapping(value="/checkLogin",method=RequestMethod.POST)
    public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password,
            HttpServletRequest request) {
        try {
            SimpleHash result = new SimpleHash("MD5",password,username,1);
            if (!TokenManager.isLogin()){
                TokenManager.login(username,result.toString(),false);
            }
            request.setAttribute("nickname",TokenManager.getNickname());
            return "index";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }
    }

    @RequestMapping(value = "/signinwithuser",method = RequestMethod.POST)
    @ResponseBody
    public ExchangeData<Object> signinWithUser(@RequestBody Fu_user user)
    {
        ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
            userService.signUser(user);
        } catch (Exception e) {
            exchangeData.markFail(e.getMessage());
        }
        return exchangeData;
    }


}
