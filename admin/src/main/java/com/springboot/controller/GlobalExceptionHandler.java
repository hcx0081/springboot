package com.springboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * {@code @Description:} 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    // 异常处理器方法，这里只处理算术异常和空指针异常
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String handlerArithmeticException(Exception e) {
        // 发生指定异常之后自动跳转页面
        return "error/5xx";
    }
}