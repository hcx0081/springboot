package com.springboot.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@code @Description:}
 */
@Data
@EqualsAndHashCode
@Builder
public class User {
    private String username;
    private String password;
}