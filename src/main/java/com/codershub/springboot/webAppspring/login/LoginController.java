package com.codershub.springboot.webAppspring.login;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private  AuthenticationService authenticationService;


    @GetMapping("login")
    public String login(){
//        model.put("name",name);
//        logger.info("Request params {}",name);
     return "login";
    }

    @PostMapping("login")
    public String welcome(@RequestParam String password,@RequestParam String name, ModelMap model){
        if(authenticationService.authenticate(name,password)) {

            model.put("name", name);

            return "welcome";
        }else {
            model.put("errorMessage","Invalid credentials! Please try again.");
            return  "login";
        }
    }

}
