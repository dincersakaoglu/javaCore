package com.dangercode.javaCore.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
    UpperClass instance = new LowerClass();
    instance.commonMethod();
    }
}
