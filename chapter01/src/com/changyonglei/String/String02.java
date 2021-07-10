package com.changyonglei.String;

public class String02 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 ==s2);//双等号比较的是值
        //垃圾回收器不会释放常量,包括常量池
        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y); //false
        //String类中已经重写了equals方法
        System.out.println(x.equals(y)); //true

        String k  = null;
        //在Java中随便用双引号括起来的都是String类的对象,所以这里的"cs"就是一个String对象,存在常量池中
        System.out.println("cs".equals(k)); //避免空指针异常
        System.out.println(k.equals("cs")); //空指针异常
    }
}
