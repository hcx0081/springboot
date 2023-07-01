package com.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-10-11 12:46:11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    
}