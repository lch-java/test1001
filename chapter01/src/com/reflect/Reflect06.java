package com.reflect;

import com.bean.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射属性Field,在计算机中翻译成字段，就是成员、属性
 * 反射com.bean.Student类当中所有Field对象
 */
public class Reflect06 {
    public static void main(String[] args) {
        //第一步:拿到Student类
        Class c = Student.class;

        //获取Class对象的完整类名
        String s = c.getName();
        System.out.println(s);

        //获取Class对象的简称类名
        String s1 = c.getSimpleName();
        System.out.println(s1);

        //获取类中所有的Field
        Field[] fields = c.getDeclaredFields();

        //获取类中所有公开的Field
        Field[] fields1 = c.getFields();

        //遍历类中所有的Field
        for (Field f:fields
             ) {
            //取出这个Field的名字
            System.out.println(f.getName());

            //取出这个Field的类型
            Class c1  = f.getType();
            String s2 = c1.getName();
            System.out.println(s2);

            //取出Field对象的属性修饰符列表
            int i = f.getModifiers(); //返回的int是修饰符的代号
            //修饰符类java.lang.reflect.Modifier中的方法static String toString(int mod),将修饰符代号--->字符串
            String s3 = Modifier.toString(i);
            System.out.println(s3);

           // System.out.println(f);
        }

        //遍历类中所有公开的Field
        for (Field f:fields1
        ) {
            //取出这个Field的名字
            System.out.println(f.getName());
        }


    }
}
