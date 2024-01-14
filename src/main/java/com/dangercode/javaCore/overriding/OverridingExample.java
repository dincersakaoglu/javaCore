package com.dangercode.javaCore.overriding;

class Animal {
    // Üst sınıfta bir metod
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Alt sınıfta, üst sınıftaki metodun üzerine yazan bir metod
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Alt sınıfa özgü yeni bir metod
    public void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Üst sınıftaki metod çağrılır

        Dog dog = new Dog();
        dog.makeSound();    // Alt sınıftaki metod çağrılır
        dog.fetch();        // Alt sınıfa özgü metod çağrılır

        // Polimorfizm kullanarak üst sınıftan referans, alt sınıftan nesne
        Animal anotherDog = new Dog();
        anotherDog.makeSound();



        // Alt sınıftaki metod çağrılır
        // anotherDog.fetch();   // Hata! Animal sınıfında fetch metodunu bulamaz.
    }
}
