package com.reflect;

import com.bean.User;

public class Reflect02 {
    public static void main(String[] args) {
       //直接new的,不灵活
       User u = new User();
       System.out.println(u);



        //通过反射机制，获取Class，通过Class来实例化对象，灵活
        try {

            //栈中的c1直接指向的是方法区中的User.class文件
            Class c1 = Class.forName("com.bean.User");

            /*//可以加泛型
            Class<User> c2 = (Class<User>) Class.forName("com.bean.User");
            //这样出来的就是指定的泛型类型了
            User user = c2.newInstance();*/

            //通过字节码文件来创建一个User对象，newInstance会调用指定字节码文件的无参构造方法
            //这个方法只能调用对应类型的无参构造，若是对应的类型中没有无参构造(默认有)，会出现实例化异常
            //通过Class类中的Object newInstance()方法来创建一个实例对象
            Object obj = c1.newInstance();

            System.out.println(obj);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
