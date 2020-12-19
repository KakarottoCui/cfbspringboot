package com.zb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cuifengbo on 2020/12/9.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}
