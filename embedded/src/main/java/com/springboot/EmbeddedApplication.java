package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan// 扫描@WebServlet、@WebFilter、@WebListener
@SpringBootApplication
public class EmbeddedApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmbeddedApplication.class, args);
    }
}