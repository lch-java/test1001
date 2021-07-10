package com.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * 反射Method(了解内容)
 */
public class Reflect10 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取一个serviceUser类对象
        Class serviceUser = Class.forName("com.service.ServiceUser");

        //获取所有的Method(包括私有的)
        Method[] allMethod = serviceUser.getDeclaredMethods();

        //遍历allMethod
        for (Method m:allMethod) {
            //获取方法名
            System.out.println(m.getName());

            //获取修饰符列表
            System.out.println(Modifier.toString(m.getModifiers()));

            //获取返回值类型
            System.out.println(m.getReturnType().getSimpleName());

            //获取方法中的形参列表中的类型(可能有多个)
            Class[] parameterTypes = m.getParameterTypes();
            for (Class parameterType : parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
