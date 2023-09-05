package com.springboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @description:}
 */
@RestController
public class RestfulController {
    
    @PutMapping("/user")
    public String put() {
        return "RESTful-PUT";
        
    }
    
    @DeleteMapping("/user")
    public String delete() {
        return "RESTful-DELETE";
    }
}