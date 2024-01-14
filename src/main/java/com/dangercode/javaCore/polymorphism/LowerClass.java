package com.dangercode.javaCore.polymorphism;

public class LowerClass extends UpperClass {
    public void lowerClassMethod() {
        System.out.println("This method belongs to lower class.");
    }
    //When we delete common method from lower classs,main method calls upper class's common method.
    //Because of this polymorphism works runtime.
    public void commonMethod() {
        System.out.println("This method belongs to lower class.But this is common method.");
    }
}
