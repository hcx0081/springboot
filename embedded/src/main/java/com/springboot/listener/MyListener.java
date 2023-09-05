package com.springboot.listener;
/**
 * {@code @description:} ${Description}
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;

// @WebListener
public class MyListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    
    public MyListener() {
        System.out.println("监听器开启监听");
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器监听程序启动");
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器监听程序销毁");
    }
}