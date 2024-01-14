package com.dangercode.javaCore.interfaces.edgequestion;

public abstract class AbstractClassA implements InterfaceA {
    //Bir interface i implemente eden abstract class,interfacein methodlarını override etmek zorunda değildir.
@Override
    public void methodA(){
    System.out.println("Method override in AbstractClassA");
}
}
