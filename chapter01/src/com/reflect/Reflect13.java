package com.reflect;

import org.omg.CORBA.Object;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 反编译一个类的constructor
 */
public class Reflect13 {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();

        Class serviceUser = Class.forName("java.lang.String");

        sb.append(Modifier.toString(serviceUser.getModifiers()) +  " class " + serviceUser.getSimpleName()
        + " {\n");

        Constructor[] constructors = serviceUser.getDeclaredConstructors();

        for (Constructor c : constructors
             ) {
            sb.append("\t" + Modifier.toString(c.getModifiers()) + " " + serviceUser.getSimpleName()
            + "(" );
            Class[] c1 = c.getParameterTypes();
            for (Class c2:c1
                 ) {
                sb.append(c2.getSimpleName());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length()-1);

            sb.append("){\n");
            sb.append("\t}\n");
        }


        sb.append("}");

        System.out.println(sb);
    }
}
