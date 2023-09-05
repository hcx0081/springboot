package com.springboot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * {@code @description:}
 */
@Component
public class Task {
    @Scheduled(cron = "0/5 * * * * 7")
    public void executeTask() {
        System.out.println("Hello World!");
    }
}