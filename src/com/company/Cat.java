package com.company;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }
    @Override
    public void work(){
        System.out.println("Cat is working...");
    }
}
