package com.example.demo;

/**
 * @Copyright: Copyright (c) 兆日科技股份有限公司
 * @Date 2022/5/9 13:21
 * @Des
 */
public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
