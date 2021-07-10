package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射机制调用构造方法
 */
public class Reflect14 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class serviceUser = Class.forName("com.service.ServiceUser");

        Object service = serviceUser.newInstance(); //调用的是无参构造
        System.out.println(service);
        Constructor constructor = serviceUser.getDeclaredConstructor(int.class,int.class);

        Object obj = constructor.newInstance(1,3);//调用指定的构造方法,
        System.out.println(obj);



    }
}
