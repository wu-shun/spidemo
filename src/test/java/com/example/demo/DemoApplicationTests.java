package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ServiceLoader;

//@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        for(Animal animal: animals) {
            animal.eat();
            animal.sleep();
        }
    }

}
