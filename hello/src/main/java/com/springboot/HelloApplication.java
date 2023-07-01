package com.springboot;

import com.springboot.config.MyConfiguration;
import com.springboot.entity.Pet;
import com.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan
@SpringBootApplication// 标识主应用程序类，相当于上面三个注解
public class HelloApplication {
    public static void main(String[] args) {
        // 获取IoC容器
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(HelloApplication.class, args);
        
        
        // 查看容器中的组件
        // String[] beanDefinitionNames = configurableApplicationContext.getBeanDefinitionNames();
        // for (String beanDefinitionName : beanDefinitionNames) {
        //     System.out.println(beanDefinitionName);
        // }
        
        // 从容器中获取组件
        // User user = (User) configurableApplicationContext.getBean("userByBoot");
        // System.out.println(user);// User{name='zs', age=20}
        
        // User user1 = configurableApplicationContext.getBean("userByBoot", User.class);
        // System.out.println("user1" + user1);
        // User user2 = configurableApplicationContext.getBean("userByBoot", User.class);
        // System.out.println(user1 == user2);// true，组件在容器中默认单例
        
        MyConfiguration myConfiguration = configurableApplicationContext.getBean(MyConfiguration.class);
        /*
         * 如果@Configuration(proxyBeanMethods = true)：配置类是代理模式代理,
         * myConfiguration为com.springboot.config.MyConfiguration$$EnhancerBySpringCGLIB$$adef7397@375b5b7f
         * 如果@Configuration(proxyBeanMethods = false)：配置类不是代理模式代理,
         * myConfiguration为com.springboot.config.MyConfiguration@6fe46b62
         * */
        System.out.println(myConfiguration);
        
        
        /*
         * 如果@Configuration(proxyBeanMethods = true)：true
         * 如果@Configuration(proxyBeanMethods = false)：false
         * */
        // User user01 = myConfiguration.user();
        // User user02 = myConfiguration.user();
        // System.out.println(user01 == user02);
        
        
        User user = configurableApplicationContext.getBean("userByBoot", User.class);
        Pet pet = configurableApplicationContext.getBean("pet", Pet.class);
        /*
         * 如果@Configuration(proxyBeanMethods = true)：true
         * 如果@Configuration(proxyBeanMethods = false)：false
         * */
        System.out.println(user.getPet() == pet);
    }
}