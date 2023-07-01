package com.springboot.yaml;

import com.springboot.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YamlApplicationTests {
    @Autowired
    private Person person;
    
    
    @Test
    void contextLoads() {
        System.out.println(person);
        // Person(userName=z
        // s, boss=false, birth=Wed Dec 12 00:00:00 CST 2012, age=18, pet=Pet(name=tomcat, weight=25.0), interests=[篮球, 20], animal=[猫, 狗], score={english=100, math=100}, salaries=[3999.0, 4999.99, 5999.99], allPets={sick=[Pet(name=tom, weight=null), Pet(name=jerry, weight=45.0), Pet(name=mickey, weight=50.0)], health=[Pet(name=mario, weight=45.0)]})
        //
    }
}