package com.dangercode.javaCore.abstractclass;

public  class Circle extends Shape {
    //If we dont override draw() method,we get an error at main.
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
