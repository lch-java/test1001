package com.reflect;

import java.lang.reflect.Field;

/**
 * 怎么通过一个反射机制访问一个Java对象的属性(重点)
 * 反射机制这种方式更加的灵活
 */
public class Reflect08 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class classStudent = Class.forName("com.bean.Student");

        //实例化一个Student对象
        Object student = classStudent.newInstance();

        //获取属性
        Field name = classStudent.getDeclaredField("name");
        System.out.println(name);
        /**
         * 访问私有属性的话，要打破封装
         * 属性赋值(三要素:类对象、类中的属性对象、字面值)
         * 类对象:student
         * 类中的属性对象:no
         * 字面值:(自定义)
         */
        //打破封装(缺点；可能会给不法分子留下机会)
        name.setAccessible(true);

        name.set(student,"梁朝辉");

        //读取属性的值(两要素:类对象、类中的属性对象)
        name.get(student);

        System.out.println(name.get(student));    //2222



    }
}
