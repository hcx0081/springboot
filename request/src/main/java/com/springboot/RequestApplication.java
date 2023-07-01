package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RequestApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RequestApplication.class, args);
        System.out.println(run.getBeanDefinitionCount());// 141
    }
}
