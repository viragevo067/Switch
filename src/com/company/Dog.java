package com.company;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
    @Override
    public void work() {
        System.out.println("Dog is working...");
    }
}
