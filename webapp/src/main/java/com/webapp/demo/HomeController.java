package com.webapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController{
    @RequestMapping("home")
    @ResponseBody    //this annotation says that whatever is returning is data to the client.
    public String Home(Alien alien){
        System.out.println(alien);
        return alien.getAname() + "has entered inside virtual with language" + alien.getLang();
    }
}