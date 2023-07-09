package com.springboot.dto;

import lombok.Data;

/**
 * {@code @Description:}
 */
@Data
public class CarDTO {
    private String make;
    private Integer seatCount;
    private String type;

    private UserDTO userDTO;
}
