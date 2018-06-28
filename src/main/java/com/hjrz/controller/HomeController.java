package com.hjrz.controller;

import com.hjrz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/index")
    public String tohome()
    {
        return "index";
    }

    @RequestMapping(value = "/error")
    public String toerror(){return "error";}

    @RequestMapping(value="/login")
    public String tologin()
    {
        return "login";
    }

    @RequestMapping(value="/adminpage")
    public String toadmin(){return "admin";}

    @RequestMapping(value="/userpage")
    public String touser(){return "user";}
}
