package com.changyonglei.String;

public class UserTest {
    public static void main(String[] args) {
        //User对象中实际存的是"张三"这个对象的内存地址
        User user = new User(110,"张三");
        System.out.println(user.getName());
    }
}
