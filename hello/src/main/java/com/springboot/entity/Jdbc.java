package com.springboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@code @description:}
 */
// @Component
// @ConfigurationProperties("jdbc")
@ConfigurationProperties("jdbc")

@Data
public class Jdbc {
    private String username;
    private String password;
}