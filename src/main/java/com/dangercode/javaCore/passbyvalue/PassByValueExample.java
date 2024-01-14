package com.dangercode.javaCore.passbyvalue;

public class PassByValueExample {
    //Pass-by-reference: When a method is called, the method arguments reference the same variable in memory as the caller.
    //Pass-by-value: When a method is called, the caller passes a copy of the argument variables to the method resulting in two values in memory.

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before: " + number);
        modifyValue(number);
        System.out.println("After: " + number);
    }

    public static void modifyValue(int x) {
        x = x * 2;
        System.out.println("Inside method: " + x);
    }
}

