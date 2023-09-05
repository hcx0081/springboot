package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @description:}
 */
// @ResponseBody
// @Controller

@RestController// 相当于上面两个注解
public class HelloController {
    @RequestMapping("/hello.html")
    public String hello() {
        return "你好 spring boot";
    }
}