package com.dangercode.javaCore.generics;

import java.util.ArrayList;
import java.util.List;

public class WrapperPrimitive<T> {
    private List<T> elements = new ArrayList<>();

    public void addElement(T element){
        elements.add(element);

    }
    public T getElement(int index){
        return elements.get(index);
    }

    public static void main(String[] args) {
        String ads = "asd";
        //Altta Integer yerine primitive değer yazamıyoruz.
        //Çünkü genericlerde primitive kullanılmaz.

        WrapperPrimitive<Integer> intListExample = new WrapperPrimitive<>();
        intListExample.addElement(43);
        intListExample.addElement(24);
    }

}
