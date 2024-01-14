package com.dangercode.javaCore.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotStreamExample {
    public static void main(String[] args) {
        // burada ise stream değil normal foreach döngüsü yaptık.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaredEvenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                squaredEvenNumbers.add(number * number);
            }
        }

        System.out.println("Girilen sayıların kareleri (çift olanlar): " + squaredEvenNumbers);
    }
}
