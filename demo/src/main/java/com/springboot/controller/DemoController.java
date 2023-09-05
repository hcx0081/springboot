package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @description:}
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot";
    }
}