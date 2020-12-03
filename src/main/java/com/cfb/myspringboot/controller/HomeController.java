package com.cfb.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cfb on 2020/9/8.
 */

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello github";
    }
}
