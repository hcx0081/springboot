package com.springboot.service;

import com.springboot.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * {@code @description:}
 */

public class HelloService {
    @Autowired
    private HelloProperties helloProperties;
    
    public String sayHello() {
        return "hello," + helloProperties.getName();
    }
}