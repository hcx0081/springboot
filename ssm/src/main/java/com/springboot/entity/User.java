package com.springboot.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * {@code @Description:}
 */
@Data
public class User {
    private String username;
    private BigDecimal balance;
}