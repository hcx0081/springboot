package com.springboot.filter;
/**
 * {@code @Description:} ${Description}
 */

import javax.servlet.*;
import java.io.IOException;

//@WebFilter(filterName = "MyFilter",value = "/MyServlet")
public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }
    
    public void destroy() {
        System.out.println("过滤器销毁");
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("前置代码");
        chain.doFilter(request, response);
        System.out.println("后置代码");
    }
}