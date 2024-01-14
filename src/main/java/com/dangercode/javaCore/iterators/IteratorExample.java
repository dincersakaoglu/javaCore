package com.dangercode.javaCore.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        //Bu şekilde yapamıyoruz
//        for(int i = 0;i< numbers.size();i++){
//
//            if(numbers.contains(numbers.get(i))){
//                numbers.remove(i);
//            }
//        }
//        System.out.println(numbers);

        System.out.println("Original List: " + numbers);

        removeDuplicates(numbers);

        System.out.println("List After Removing Duplicates: " + numbers);




    }
    private static void removeDuplicates(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        List<Integer> uniqueNumbers = new ArrayList<>();

        while (iterator.hasNext()) {
            Integer currentNumber = iterator.next();
            System.out.println(currentNumber);
            if (!uniqueNumbers.contains(currentNumber)) {
                uniqueNumbers.add(currentNumber);
            } else {
                // Duplicate found, remove it
                iterator.remove();
            }
        }
    }
}
