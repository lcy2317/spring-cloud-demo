package com.example.lcyserver.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author lichengyang
 * @Date 2021/4/5 19:00
 */
@RestController
public class TestController {

    @Autowired
    private Rest rest;

    @GetMapping(value = "/test")
    public String say() {
        return rest.sayHiFromClientOne("12312312");
    }
}
