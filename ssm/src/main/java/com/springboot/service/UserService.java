package com.springboot.service;

import com.springboot.entity.User;

import java.util.List;

/**
 * {@code @description:}
 */
public interface UserService {
    List<User> findAll();
}