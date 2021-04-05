package com.example.lcyserver.demo;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author lichengyang
 * @Date 2021/4/5 19:09
 */
@Component
public class Fallback implements Rest{
    @Override
    public String sayHiFromClientOne(String name) {
        return "ERROR";
    }
}
