package com.springboot.service;

import com.springboot.entity.User;

import java.util.List;

/**
 * {@code @Description:}
 */
public interface UserService {
    
    List<User> findAll();
}