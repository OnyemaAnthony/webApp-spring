package com.codershub.springboot.webAppspring.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username,String password){
        boolean isValidUsername = username.equalsIgnoreCase("Anthony");
        boolean isValidPassword = password.equalsIgnoreCase("this.tony");
        return  isValidUsername && isValidPassword;
    }
}

