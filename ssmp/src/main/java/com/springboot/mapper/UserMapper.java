package com.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.entity.User;

/**
 * {@code @description:}
 */

/**
 * 继承BaseMapper<T>，可以指定泛型的类
 */
public interface UserMapper extends BaseMapper<User> {
}