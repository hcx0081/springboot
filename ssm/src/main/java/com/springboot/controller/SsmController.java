package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@code @Description:}
 */
@RestController
public class SsmController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/findAll")
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }
}