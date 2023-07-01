package com.springboot.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DataApplicationTests {
    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Test
    void contextLoads() {
        // Druid：class com.alibaba.druid.pool.DruidDataSource
        // Druid的Starter：class com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceWrapper
        System.out.println(dataSource.getClass());
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user;");
        list.forEach(System.out::println);// {username=A, balance=7000.0}
    }
}