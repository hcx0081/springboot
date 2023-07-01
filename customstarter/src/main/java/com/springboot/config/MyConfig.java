package com.springboot.config;

import com.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @Description:}
 */
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}