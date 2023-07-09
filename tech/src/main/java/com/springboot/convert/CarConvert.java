package com.springboot.convert;

import com.springboot.dto.CarDTO;
import com.springboot.dto.UserDTO;
import com.springboot.entity.Car;
import com.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * {@code @Description:}
 */
@Mapper
public interface CarConvert {
    CarConvert INSTANCE = Mappers.getMapper(CarConvert.class);

    @Mapping(target = "userDTO", source = "user")
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDTO carToCarDTO(Car car);

    UserDTO userToUserDTO(User user);
}
