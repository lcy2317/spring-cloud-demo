package com.example.userserver.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author lichengyang
 * @Date 2021/4/5 19:01
 */
@RestController
public class TestController {

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return "asdasda"+ name;
    }

}
