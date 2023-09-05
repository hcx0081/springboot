package com.springboot.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @description:}
 */
@Log4j2
@RestController
public class TechController {
    @RequestMapping("/")
    public String tech() {
        log.info("hello");// c.springboot.controller.TechController   : hello
        return "hello";
    }
}