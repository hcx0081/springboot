package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

/**
 * {@code @description:}
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    /* 方便调试查看 */
    @Autowired
    private CacheManager cacheManager;
    
    @Autowired
    private UserService userService;
    
    @CachePut(value = "userCache", key = "#user.id")
    @PostMapping
    public User save(User user) {
        userService.save(user);
        return user;
    }
    
    @CacheEvict(value = "userCache", key = "#id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.removeById(id);
    }
    
    
    @CacheEvict(value = "userCache", key = "#user.id")
    @PutMapping
    public User update(User user) {
        userService.updateById(user);
        return user;
    }
    
    @Cacheable(value = "userCache", key = "#id"/* , unless = "#result == null" */)// 当方法返回值为空时不缓存数据
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return user;
    }
}