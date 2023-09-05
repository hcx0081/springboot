package com.springboot.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * {@code @description:}
 */
public class Person {
    @NotNull
    @Size(max = 64)
    private String name;
    
    @Min(0)
    private int age;
}