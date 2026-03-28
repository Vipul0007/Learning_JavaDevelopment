package com.practice.demoapp.Controller;

import com.practice.demoapp.Model.Alien;
import com.practice.demoapp.Repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    DataRepository dataRepo;

    @RequestMapping("/")
    @ResponseBody
    public String Home(Alien alien){
        System.out.println("Reached here...");
        dataRepo.save(alien);
        return "Hello World!";
    }
}
