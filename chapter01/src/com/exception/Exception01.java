package com.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的定义:程序出现了不正常的情况
 * 作用:增强程序的健壮性
 * 异常在Java中以类的形式存在，每一个异常类都可以创建对象
 * 在发生异常的时候，JVM虚拟机会在当前出错行new出来一个相关的异常，再将这个异常对象抛出，打印信息输出到控制台
 * 出现一次异常就会创建一次相关的异常对象
 * 所有的异常类的父类都是java.lang.Throwable,它的父类则是Object类
 * Throwable类有两个直接的子类Error,Exception
 */
public class Exception01 {
    public static void main(String[] args) {
        //通过异常类创建异常对象
        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);    //java.lang.NullPointerException: 空指针异常
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy--MM--dd HH:mm:ss");
        sdf = null;
        sdf.format(date);

    }

}
