package com.springboot.mapper;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * {@code @Description:}
 */
@Mapper// mybatis-spring-boot-starter将默认搜寻带有@Mapper注解的Mapper接口
public interface UserMapper {
    List<User> findAll();
}