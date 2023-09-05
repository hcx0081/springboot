package com.springboot.controller;

import com.springboot.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * {@code @description:}
 */
@Controller
public class ViewController {
    @RequestMapping("/view")
    public String view(Model model, Person person, Errors errors) {
        int i = 1 / 0;
        System.out.println(errors);
        model.addAttribute("username", "zs");
        model.addAttribute("link", "https://www.bilibili.com");
        return "view";
    }
}