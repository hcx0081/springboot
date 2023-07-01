package com.springboot.config;

import com.springboot.filter.MyFilter;
import com.springboot.listener.MyListener;
import com.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import java.util.Collections;
import java.util.EventListener;

/**
 * {@code @Description:}
 */
@Configuration
public class MyConfig {
    // 注册Servlet
    @Bean
    public ServletRegistrationBean<Servlet> servletRegistrationBean() {
        MyServlet myServlet = new MyServlet();
        // @WebServlet(name = "MyServlet", value = "/MyServlet")
        ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<>(myServlet, "/MyServlet");
        return servletRegistrationBean;
    }
    
    // 注册Filter
    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        MyFilter myFiler = new MyFilter();
        
        // @WebFilter(filterName = "MyFilter",value = "/MyServlet")
        
        // FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>(myFiler, servletRegistrationBean());
        // return filterRegistrationBean;
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>(myFiler);
        filterRegistrationBean.setUrlPatterns(Collections.singleton("/MyServlet"));
        return filterRegistrationBean;
        
    }
    
    // 注册Listener
    @Bean
    public ServletListenerRegistrationBean<EventListener> servletListenerRegistrationBean() {
        // @WebListener
        MyListener myListener = new MyListener();
        return new ServletListenerRegistrationBean<>(myListener);
    }
}