package com.springboot.ssmbyano;

import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmbyanoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    
    @Test
    void contextLoads() {
        List<User> userList = userMapper.findAll();
        userList.forEach(System.out::println);
    }
    
}