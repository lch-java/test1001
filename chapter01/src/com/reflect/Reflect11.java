package com.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 了解以下，无需掌握
 */
public class Reflect11 {

    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();

        Class serviceUser = Class.forName("java.lang.String");

        Method[] allMethod = serviceUser.getDeclaredMethods();

        sb.append(Modifier.toString(serviceUser.getModifiers()) + " class " + serviceUser.getSimpleName()
        + " {\n");

        for (Method m:allMethod
             ) {
            sb.append("\t"+ Modifier.toString(m.getModifiers()) + " " +m.getReturnType().getSimpleName() + " "
            + m.getName() + "(" );

            Class[] parameterTypes = m.getParameterTypes();
            for (Class parameter:parameterTypes){
                sb.append(parameter.getSimpleName());
                sb.append(",");
            }
            //删除指定下标位置的字符
            sb.deleteCharAt(sb.length()-1);
            sb.append(")" + "{}\n");
        }
        System.out.println(sb);
    }
}
