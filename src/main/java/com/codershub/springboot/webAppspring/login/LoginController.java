package com.codershub.springboot.webAppspring.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model){
        model.put("name",name);
        System.out.println("the name in the req is "+name);
     return "login";
    }

}
