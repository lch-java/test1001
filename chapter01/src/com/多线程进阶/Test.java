package com.多线程进阶;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "线程执行的时间" + System.currentTimeMillis());

            }

            @Override
            public String toString() {
                return Thread.currentThread().getName() ;
            }
        };
        t.setName("t");
        t.start();

        System.out.println("主线程执行的时间" + System.currentTimeMillis());

        //使用lambda表达式简化用@FunctionalInterface修饰的接口
        Runnable runnable = () ->{
            System.out.println(Thread.currentThread().getName() +"线程执行的时间" + System.currentTimeMillis());
        };

        Thread t1 = new Thread(runnable,"t1");
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        t2.setName("t2");
        t2.start();




        //创建线程对象的第三种方式，由于FutureTask间接实现了Runnable，所以可以作为参数传入到Thread的构造方法中
        FutureTask futureTask = new FutureTask(() -> {
                System.out.println(Thread.currentThread().getName() + "线程执行" + System.currentTimeMillis());
                return 1;
        });

        Thread t3 = new Thread(futureTask,"t3");
        t3.start();


    }
}

