package com.springboot.config;

import com.springboot.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @description:}
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}