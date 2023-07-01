package com.springboot;

import com.springboot.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Person.class)
public class YamlApplication {
    public static void main(String[] args) {
        for (String beanDefinitionName : SpringApplication.run(YamlApplication.class, args).getBeanDefinitionNames()) {
            
            System.out.println(beanDefinitionName);
        }
    }
}