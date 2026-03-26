package com.webapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController{
    @RequestMapping("home")
    @ResponseBody    //this annotation says that whatever is returning is data to the client.
    public String Home(@ModelAttribute Alien alien){  //over here the the Alien class use Model Attribute binding which default make Alien alien = new Alien()
        System.out.println(alien);
        return alien.getAname() + "has entered inside virtual with language" + alien.getLang();
    }
}