package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WebsceneApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(WebsceneApplication.class, args);
    }
    
}