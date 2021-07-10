package com.changyonglei.array;

public class Array05 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];

        System.out.println(animal[0]);  //Animal数组中的第一个数据是null

        animal[0] = new Animal();   //一个Animal对象的内存地址赋值给Animal数组中的第一个元素
        animal[0] = new Cat();      //多态，子类Cat继承了Animal，所以可以存储Cat对象的内存地址
        System.out.println(animal[0]);  //输出Cat对象的内存地址




        //main方法的数组长度
        if (args.length != 2){
            System.out.println("您输入的数据异常，请重新输入");
            return;
        }

        Object username = args[0];
        String password = args[1];

        //用变量调用equals方法可能会出现空指针异常，所以用具体的String类型的值去调用
        if ("86159".equals(username) && "yuhong".equals(password)){
            System.out.println("欢迎"+ username +  "回来！");
        }else {
            System.out.println("您输入的用户名或密码错误，请重新输入");
        }
    }
}

class Animal {
}

class Cat extends Animal{}

class Bird extends Animal{}