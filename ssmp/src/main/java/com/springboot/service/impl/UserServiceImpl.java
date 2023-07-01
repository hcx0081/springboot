package com.springboot.service.impl;

import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@code @Description:}
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    
    public List<User> findAll() {
        
        List<User> userList = userMapper.selectList(null);
        return userList;
    }
}