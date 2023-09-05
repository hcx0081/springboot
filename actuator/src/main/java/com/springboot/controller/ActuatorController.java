package com.springboot.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @description:}
 */
@RestController
public class ActuatorController {
    Counter counter;
    
    public ActuatorController(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("com.springboot.controller.ActuatorController.count");
    }
    
    @RequestMapping("hello")
    public String hello() {
        counter.increment();
        return "hello";
    }
}