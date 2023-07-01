package com.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@code @Description:}
 */
@ConfigurationProperties("hello")
@Data
public class HelloProperties {
    private String name;
}