package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoApplication {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(AutoApplication.class, args).getBeanDefinitionCount());
    }
}