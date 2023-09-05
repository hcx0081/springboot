package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * {@code @description:} SpringBoot配置类
 */
@Configuration
public class SpringConfig /* implements WebMvcConfigurer */ {
    /* 自定义SpringBootMVC的配置 */
    // 方式一
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }
        };
    }
    
    // 方式二
    // @Override
    // public void configurePathMatch(PathMatchConfigurer configurer) {
    //     UrlPathHelper urlPathHelper = new UrlPathHelper();
    //     urlPathHelper.setRemoveSemicolonContent(false);// false表示不移除请求路径中分号后面的内容
    //     configurer.setUrlPathHelper(urlPathHelper);
    // }
    
    
    /*RESTful风格中自定义接收隐藏域的name的值，替代默认的_method*/
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        hiddenHttpMethodFilter.setMethodParam("_m");
        return hiddenHttpMethodFilter;
    }
}