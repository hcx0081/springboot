package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * {@code @description:}
 */
@Controller
public class SqlController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/sql")
    public void sql() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user;");
        list.forEach(System.out::println);// {username=A, balance=7000.0}
    }
}