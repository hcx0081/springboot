package com.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@code @Description:}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String make;
    private Integer numberOfSeats;
    private CarType type;

    private User user;
}
