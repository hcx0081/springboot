package com.springboot.controller;

import com.springboot.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * {@code @description:}
 */
@Controller
public class ResponseController {
    
    @RequestMapping("/person")
    @ResponseBody
    public Person person() {
        Person person = new Person();
        person.setName("zs");
        person.setAge(20);
        return person;
    }
    
}