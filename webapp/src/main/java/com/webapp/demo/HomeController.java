package com.webapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController{
    @RequestMapping("home")
    @ResponseBody    //this annotation says that whatever is returning is data to the client.
    public String Home(){
        System.out.println("Hello World");
        return "You have entered inside Home...";
    }
}