package com.springboot.mapper;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * {@code @description:}
 */
// @Mapper
public interface UserMapper {
    @Select("select username, balance from user;")
    List<User> findAll();
}