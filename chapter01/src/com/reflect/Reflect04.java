package com.reflect;

/**
 * 研究static Class forName(String "完整文件名")方法发生了什么
 * 可以让某个类的静态代码块执行，直接调用Class.forName(String className)
 * 这个方法的执行会导致类加载，类加载时，静态代码块会执行
 */
public class Reflect04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.bean.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
