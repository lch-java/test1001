package com.exception;

/**
 * 什么是UML？
 * 一种统一的建模语言，一种图标式语言(画图的)
 * 只要是面向对象的编程语言都可以用UML
 * 软件设计师用的
 * UML可以描述类和类之间的关系，程序执行的流程，对象的状态等
 * UML图相当于设计图
 */
public class Exception02 {
    public static void main(String[] args) {
        // java.lang.ArithmeticException运行时异常，因为它的父类是RuntimeException
        System.out.println(1/0);
    }
}
