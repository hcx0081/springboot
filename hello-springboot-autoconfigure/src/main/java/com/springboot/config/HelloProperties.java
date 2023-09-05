package com.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@code @description:}
 */
@ConfigurationProperties("hello")
@Data
public class HelloProperties {
    private String name;
}