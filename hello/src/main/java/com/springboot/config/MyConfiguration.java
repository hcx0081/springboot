package com.springboot.config;

import com.springboot.entity.Jdbc;
import com.springboot.entity.Pet;
import com.springboot.entity.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @Description:}
 */
@Configuration(proxyBeanMethods = false)

@EnableConfigurationProperties(Jdbc.class)// 开启Jdbc类的配置绑定功能
public class MyConfiguration {
    @Bean("userByBoot")
    public User user() {
        User user = new User("zs", 20);
        // userByBoot组件引用了pet组件
        user.setPet(pet());
        return user;
    }
    
    @Bean
    public Pet pet() {
        return new Pet("cat");
    }
}