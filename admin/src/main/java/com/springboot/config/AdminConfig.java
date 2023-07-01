package com.springboot.config;

import com.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * {@code @Description:} 自定义MVC功能配置类
 */
@Configuration
public class AdminConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptor = registry.addInterceptor(new LoginInterceptor());
        interceptor.addPathPatterns("/**");// 拦截所有路径
        interceptor.excludePathPatterns("/", "/loginPage", "/login");
        interceptor.excludePathPatterns("/css/**", "/fonts/**", "/images/**", "/js/**");// 放行静态资源
    }
}