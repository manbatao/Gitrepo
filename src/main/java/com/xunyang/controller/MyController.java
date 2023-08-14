package com.xunyang.controller;


import com.xunyang.model.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {


    @Resource
    private School school;


    @RequestMapping("/hello")
    public School Hello(){
        
        return "hello world";
    }
}
