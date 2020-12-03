package com.cfb.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cfb.myspringboot.mapper")
@SpringBootApplication
@ComponentScan(basePackages = {"com.cfb.myspringboot"})
@ServletComponentScan

public class MyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}
