package com.springboot.tech;

import com.springboot.convert.CarConvert;
import com.springboot.dto.CarDTO;
import com.springboot.entity.Car;
import com.springboot.entity.CarType;
import com.springboot.entity.User;
import org.junit.jupiter.api.Test;

// @SpringBootTest
class TechApplicationTests {
    @Test
    void contextLoads() {
        CarConvert carConvert = CarConvert.INSTANCE;
        Car car = new Car("纸盒", 20, CarType.SMALL, new User("zs", "123"));
        CarDTO carDTO = carConvert.carToCarDTO(car);
        System.out.println(carDTO);
    }
}
