package com.springboot.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * {@code @description:}
 */
@Data
public class User {
    private String username;
    private BigDecimal balance;
}