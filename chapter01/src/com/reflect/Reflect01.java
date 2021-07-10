package com.reflect;

import java.util.Date;

/**
 * 怎么获取java.lang.Class的实例，只有获取到具体的字节码文件，反射机制才能用的上，对其进行操作
 * 三种方式:
 *
 */
public class Reflect01 {
    public static void main(String[] args) {
        /**
         * 获取Class文件的第一种方式
         * static Class forName(String className)
         * 这个className需要的是一个完整的类名，java.lang也不能少
         * c1 代表String.class
         * c2 代表System.class
         * c3 代表SimpleDateFormat.class
         * 拿到class文件的第一种方式
         */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");
            Class c2 = Class.forName("java.lang.System");
            Class c3 = Class.forName("java.text.SimpleDateFormat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * 获取字节码文件的第二种方式
         * 在Java中，任何一个对象都有一个方法:Class getClass()
         * 第二种获取Class的方式就是通过getClass()方法
         * getClass方法在Object中已经实现了，这里调用的实际是Object中的getClass方法
         * 这个方式实际上是通过一个具体类型的实例去调用getClass方法来获取对应的类型的
         * 注意:字节码文件装载到JVM虚拟机上时只装载一份
         */

        String s = "1";
        Class c4 = s.getClass();
        System.out.println(c4 == c1);

        /**
         * 获取字节码文件的第三种方式
         * 在Java语言中，任何一个类都有.class属性
         */

        Class c5 = String.class;
        Class c6 = int.class;
        Class c7 = Date.class;

    }
}
