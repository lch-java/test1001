package com.reflect;

import java.util.ResourceBundle;

/**
 * java.util包下提供了一个资源绑定器，便于获取属性文件的内容(只能用于在类路径下的properties文件)
 */
public class ResourceBundle01 {
    public static void main(String[] args) {
        //资源绑定器(只能获取在类路径下的properties属性配置文件)
        //这个东西代替了io流和properties的连用,这种方式路径的后面不能加后缀
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo02");

        String s = bundle.getString("className0");

        //System.out.println(s);

        try {
            Class c = Class.forName(s);
            Object obj = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
