package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springboot.mapper")// 指定扫描的包，将包中的Mapper接口注册到容器中
@SpringBootApplication
public class SsmpApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SsmpApplication.class, args);
    }
    
}