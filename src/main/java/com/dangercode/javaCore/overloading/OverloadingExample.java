package com.dangercode.javaCore.overloading;

public class OverloadingExample {

    // Metodun ilk versiyonu: iki tamsayıyı toplar
    public int add(int a, int b) {
        return a + b;
    }

    // Metodun ikinci versiyonu: üç tamsayıyı toplar
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Metodun üçüncü versiyonu: iki double'ı toplar
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        // İlk metodunu çağırma
        System.out.println("Sum of two integers: " + example.add(5, 10));

        // İkinci metodunu çağırma
        System.out.println("Sum of three integers: " + example.add(5, 10, 15));

        // Üçüncü metodunu çağırma
        System.out.println("Sum of two doubles: " + example.add(3.5, 2.5));
    }
}

