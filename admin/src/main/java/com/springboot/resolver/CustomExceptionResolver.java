package com.springboot.resolver;

import com.springboot.exception.CustomException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * {@code @Description:} 自定义异常解析器
 */
@Order(Ordered.HIGHEST_PRECEDENCE)// 最高优先级
@Component
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 如果发生的异常是自定义异常
        if (ex instanceof CustomException) {
            /*
             * 如果没有标注@Order，跳转4xx页面
             * 因为@ResponseStatus注解处理异常的优先级比HandlerExceptionResolver接口的实现类处理异常的优先级高
             * 所以使用@Order设置高优先级，使该类优先处理异常
             * */
            return new ModelAndView("error/5xx");
        }
        // 如果发生的异常是其他异常
        return new ModelAndView("main");
    }
}