package com.hjrz.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope(value="prototype")
public class PageController {

    @RequestMapping(value="/adminstrative")
    public String toadminstrative()
    {
        return "page/adminstrative";
    }

    @RequestMapping(value="/fileupload")
    public String tofileupload()
    {
        return "page/fileupload";
    }

    @RequestMapping(value="/sales")
    public String tosales()
    {
        return "page/sales";
    }
}
