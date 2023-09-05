package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * {@code @description:}
 */
@Controller
public class RequestController {
    /**
     * http://localhost:8080/RP?username=zs&age=20
     *
     * @param map
     */
    @RequestMapping("/RP")
    public void RP(@RequestParam Map map) {
        System.out.println(map);//{username=zs, age=20}
    }
    
    
    /**
     * 根据index.html页面的表单提交的内容获得请求体数据
     *
     * @param requestBody
     */
    @RequestMapping("/RB")
    public void RB(@RequestBody String requestBody) {
        System.out.println(requestBody);// username=zs&password=123
    }
    
    
    /**
     * 将数据存入Request域中
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/setRA")
    public String setRA(HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("name", "zs");
        httpServletRequest.setAttribute("age", 20);
        httpServletRequest.setAttribute("sex", "man");
        return "RA";// 默认为请求转发，可以共享Request域中的数据；重定向不能共享数据
    }
    
    /**
     * 使用@RequestAttribute注解获取Request域中指定属性的值
     *
     * @param name
     * @param age
     * @param httpServletRequest
     */
    @RequestMapping("/RA")
    public void RA(@RequestAttribute("name") String name,
                   @RequestAttribute("age") String age,
                   HttpServletRequest httpServletRequest) {
        System.out.println(name);// zs
        System.out.println(age);// 20
        System.out.println(httpServletRequest.getAttribute("sex"));// man
    }
    
    
    /*
     * http://localhost:8080/MV/username;username=zs,li,ww;realname=person/password;password=123
     *  */
    @RequestMapping("/MV/{username}/{password}")
    public void MV(@PathVariable("username") String path1,
                   @PathVariable("password") String path2,
                   @MatrixVariable List<String> username,
                   @MatrixVariable String realname,
                   @MatrixVariable String password) {
        System.out.println(path1);// username
        System.out.println(path2);// password
        System.out.println(username);// [zs, li, ww]
        System.out.println(realname);// person
        System.out.println(password);// 123
    }
}