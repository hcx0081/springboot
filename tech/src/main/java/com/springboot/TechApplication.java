package com.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TechApplication {
    public static void main(String[] args) {
        SpringApplication.run(TechApplication.class, args);
        log.info("11{}", 1);
    }
    
}