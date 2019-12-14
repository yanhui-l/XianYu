package com.example.Market.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DomeController {

    @RequestMapping(value = "/Login")
    public String Login(){
        String test="测试";


        return "Login";
    }
}
