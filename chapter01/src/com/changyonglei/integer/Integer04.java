package com.changyonglei.integer;

/**
 * 自动拆装箱【面试题】
 * JDK5之后Java支持自动装拆箱
 * 一般的大型项目会用到缓存机制来优化，一般网页的首页也会用到缓存机制
 * 缓存机制，将数据提前存在内存中，执行效率会很高，不用去和数据库交互，去和机器硬盘交互
 * 从内存中拿出来用是通过电流交互，执行很快
 * 而通过机器去交互会很慢
 */
public class Integer04 {
    public static void main(String[] args) {
        Integer i0 = new Integer(1);//手动装箱
        Integer i = 1;//自动装箱,i中存的是内存地址
        int i1 = i; //自动拆箱
        int i2= i.intValue(); //手动拆箱
        //+ - * /运算会触发包装类型的自动拆箱，i0和i都是包装类型
        System.out.println(i0 + i + i1 + i2);//包装和基本数据进行运算没有报错是有因为可以

        /**
         * byte的取值范围是[-128,127],Java为了方便开发，便将这个取值范围的数据已经建好存到方法区的"整数型常量池"中了，
         * 这个范围的整数数据在类加载的时候就已经初始化了，而包装类调用这个范围的数据时就只向这个整数型常量池去调用
         */
        //在byte取值范围之内，调用已有的整数型常量池的数据，所以它们指向的对象是同一个
        //整数型常量池中的数据都是一个对象
        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println(i3 == i4);   //true

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);   //false
    }
}
