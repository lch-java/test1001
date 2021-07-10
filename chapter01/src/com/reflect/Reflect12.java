package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * 反射机制调用方法
 * ①、获取class文件
 * ②、实例化对象
 * ③、获取到某个具体的方法Method
 * ④、调用Method中的Object invoke(Object obj,Object... args)这个方法最重要
 * 反射机制需要修改的内容都在配置文件中，而通过反射机制写的代码无需任何更改，很灵活
 * 在以后只需对配置文件中的内容进行更改就可以调用不同类中不同的方法
 */
public class Reflect12 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

           Class stringClass = Class.forName("com.service.ServiceUser");

            Object serviceUser = stringClass.newInstance();


        Method logout = stringClass.getDeclaredMethod("logout");
        Method login = stringClass.getMethod("login",String.class,String.class);

        /**
         * 调用方法四要素:
         * ①、类对象
         * ②、方法名
         * ③、实参列表
         * ④、返回值
         */
        //Method中的Object invoke(Object obj,Object... args)这个方法最重要
        Object returnValue = login.invoke(serviceUser,"admin","123");
        System.out.println(returnValue);

        //同样若调用的是私有方法，也需要打破封装
        logout.setAccessible(true);
        logout.invoke(serviceUser);





    }
}
