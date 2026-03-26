package com.practice.demoapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
//        ModelAndView mv = new ModelAndView("home");
        System.out.println("Reached here...");
        return "home";
    }
}
