package com.reflect;

/**
 * 给一个类，怎么获取这个类的父类，已实现了哪些接口
 */
public class Reflect15 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class stringClass = Class.forName("java.lang.String");

        //获取String类的父类
        Class superStringClass = stringClass.getSuperclass();
        System.out.println(superStringClass.getSimpleName());

        //获取String类所有已实现的接口
        Class[] interfaces = stringClass.getInterfaces();


        for (Class inter : interfaces){
            System.out.println(inter.getSimpleName());
        }

    }
}
