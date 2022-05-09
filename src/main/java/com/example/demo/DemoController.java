package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ServiceLoader;

/**
 * @Copyright: Copyright (c) 兆日科技股份有限公司
 * @Date 2022/5/9 13:33
 * @Des
 */
@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping("/world")
    public String getValue(){
        ServiceLoader.load(String.class);
        return "Hello Keycloak!";
    }

    public static void main(String[] args) {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        for(Animal animal: animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
