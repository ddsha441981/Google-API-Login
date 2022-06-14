package com.codewithcup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
//@RequestMapping("/")
public class LoginController {

    @GetMapping("/")
    public String homePage(){
        return "Anyone can access this page";
    }

    // Login Module
    @GetMapping("/v1/auth/api/login")
    public Principal login(Principal principal){
        return principal;
    }
}
