package com.dangercode.javaCore.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        // Bir liste oluşturuyoruz
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        // Java Stream API kullanarak çift sayıları filtreleyip karelerini alıyoruz
        List<Integer> squaredEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)   // Çift sayıları filtrele
                .map(n -> n * n)           // Sayıların karesini al
                .collect(Collectors.toList());  // Sonuçları bir liste olarak topla

        // Sonuçları ekrana yazdır
        System.out.println("Girilen sayıların kareleri (çift olanlar): " + squaredEvenNumbers);
        System.out.println(numbers);
    }




}
