package com.springboot.entry;

import com.springboot.entity.Jdbc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {
    @Autowired
    private Jdbc jdbc;
    
    @Test
    void testCC() {
        System.out.println(jdbc);// Jdbc{username='root', password='200081'}
    }
}