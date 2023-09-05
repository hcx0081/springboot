package com.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * {@code @description:}
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "自定义异常"/* 相当于message */)
public class CustomException extends Exception {

}