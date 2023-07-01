package com.springboot.ssm;

import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmApplicationTests {
    @Autowired
    private UserService userService;
    
    @Test
    void contextLoads() {
        List<User> userList = userService.findAll();
        userList.forEach(System.out::println);
    }
}