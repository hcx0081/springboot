package com.springboot.controller;

import com.springboot.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * {@code @description:}
 */
@Controller
public class ExceptionController {
    @RequestMapping("exGlobal")
    public void exGlobal() {
        int i = 10 / 0;
    }
    
    @RequestMapping("exCustom")
    public void exCustom() throws CustomException {
        throw new CustomException();
    }
}