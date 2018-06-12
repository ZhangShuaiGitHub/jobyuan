package com.jobyuan.controller;

import com.jobyuan.servcie.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloTest {

    @Autowired
    HelloService hs;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name",hs.selectByPrimaryKey().getName());
        return "index";
    }


}
