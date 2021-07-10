package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过反射机制反编译一个类的Field(了解)
 * 只要知道一个class字节码文件就可以反编译出它的所有Field对象
 */
public class Reflect07 {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("java.lang.Thread");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        //取出该类中所有的Field对象
        Field[] fields = c.getDeclaredFields();

        //"\t"转义成制表符
        for (Field f :fields
             ) {
            sb.append("\t" + Modifier.toString(f.getModifiers()) + " " + f.getType().getSimpleName()
                    + " " + f.getName() + "\n");
        }




        sb.append("}");
        System.out.println(sb);
    }
}
