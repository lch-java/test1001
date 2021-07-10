package com.bean;

public class MyClass {
    //静态代码块在类加载的时候执行一次，被称为类加载时机

    static{
        System.out.println("静态代码块正在执行....");
    }
}
