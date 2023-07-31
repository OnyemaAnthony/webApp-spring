package com.codershub.springboot.webAppspring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SayHelloController {


    @RequestMapping("say-hello")
    @ResponseBody
    public Map<String, String> sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Anthony");
        map.put("age", "24");
        map.put("City", "Enugu");
        map.put("School", "UNN");
        return map;
    }
}
