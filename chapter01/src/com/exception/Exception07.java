package com.exception;

/**
 * final、finalize、finally的区别
 * final可以修饰类(无法被继承)、方法(无法被重写)、属性
 *
 * finalize由垃圾回收器GC负责调用，不用手动去调用
 * finalize方法的源码：
 * protected void finalize() throws Throwable {}
 * 在项目中，都需要记录对象被释放的时间，这个负责记录时间的Java语句就写到finalize方法中
 * 类只能由缺省和public修饰，抽象类不能被final修饰,内部类四个修饰符都可以用
 *
 * finally中的代码定会执行，于try连用处理异常机制的，一般用来对资源的释放
 *
 */
public class Exception07 {
    public static void main(String[] args) {
        //final、finally是一个关键字，
        //finalize是Object类中的一个方法名，finalize是一个标识符
        //常量是用static final 联合修饰的属性
        final double MATH_PAI = 3.1415926;

    }
}
