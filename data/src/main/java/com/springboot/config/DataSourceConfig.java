package com.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Collections;

/**
 * {@code @Description:}
 */
@Configuration
public class DataSourceConfig {
    // 自定义配置DataSource之后，SpringBoot容器中默认的HikariCP数据源便会失效
    @ConfigurationProperties("spring.datasource")// 将数据源对象的属性和SpringBoot配置文件前缀：spring.datasource的配置项进行配置绑定
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        /* 使用SpringBoot配置文件进行配置数据源信息，无需进行编码 */
        // druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // druidDataSource.setUrl("jdbc:mysql://localhost:3306/book");
        // druidDataSource.setUsername("root");
        // druidDataSource.setPassword("623363564");
        
        /* 开启防火墙防御SQL注入攻击 */
        // druidDataSource.setFilters("wall");
        /* 设置filters的属性值为stat，开启SQL监控 */
        // druidDataSource.setFilters("stat");
        
        druidDataSource.setFilters("stat,wall");
        return druidDataSource;
    }
    
    // 配置Druid监控页面
    // http://localhost:8080/druid
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        // 注册StatViewServlet，并将其映射路径设置为/druid/*
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        // 设置配置监控页面的用户名和密码（可选）
        servletRegistrationBean.addInitParameter("loginUsername", "druid");
        servletRegistrationBean.addInitParameter("loginPassword", "druid");
        return servletRegistrationBean;
    }
    
    // 开启内置监控中的Web-JDBC关联监控的数据
    @Bean
    public FilterRegistrationBean<WebStatFilter> druidWebStatFilter() {
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        // 监控所有路径
        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
        // 监控不包括以下路径
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}