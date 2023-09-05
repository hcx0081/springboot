package com.springboot.config;

import com.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @description:}
 */
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}