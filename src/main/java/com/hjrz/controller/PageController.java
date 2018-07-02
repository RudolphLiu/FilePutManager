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
        return "pages/adminstrative";
    }

    @RequestMapping(value="/fileupload")
    public String tofileupload()
    {
        return "pages/fileupload";
    }

    @RequestMapping(value="/sales")
    public String tosales()
    {
        return "pages/sales";
    }
}
