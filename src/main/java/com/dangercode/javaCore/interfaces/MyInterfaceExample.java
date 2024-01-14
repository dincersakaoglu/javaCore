package com.dangercode.javaCore.interfaces;

public class MyInterfaceExample implements  InterfaceExample{
    //we should override these two methods
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }
    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}
