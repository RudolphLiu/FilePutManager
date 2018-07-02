package com.hjrz.controller;

import com.hjrz.entity.Fu_user;
import com.hjrz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Scope(value="prototype")
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/list")
    public ModelAndView list(ModelMap modelMap)
    {
        List<Fu_user> userList = userService.selectAllUser();
        modelMap.put("userlist",userList);
        return new ModelAndView("user/list");
    }
}
