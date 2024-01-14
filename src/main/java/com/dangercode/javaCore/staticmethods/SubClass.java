package com.dangercode.javaCore.staticmethods;

class SubClass extends BaseClass {
    // If you remove static keyword,you get an error.
    public static void staticMethod() {
        System.out.println("SubClass - Static Method");
    }
}
