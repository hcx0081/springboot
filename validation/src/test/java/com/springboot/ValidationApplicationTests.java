package com.springboot;

import com.springboot.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

import javax.annotation.Resource;

@SpringBootTest
class ValidationApplicationTests {
    
    @Resource
    Validator validator;
    
    @Test
    void contextLoads() {
        Person person = new Person();
        BindException bindException = new BindException(person, "人");
        validator.validate(person, bindException);
        System.out.println(bindException.getMessage());
    }
    
}