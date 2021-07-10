package com.thread;

/**
 * 实现多线程的第二种方式（采用接口的方式实现多线程）
 * 实现Runnable接口，重run方法
 */
public class Thread02 {
    public static void main(String[] args) {
        //创建一个可运行类的对象
        MyRunnable mr  = new MyRunnable();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        //创建一个线程对象，将封装后的运行类对象传进构造方法中
        Thread t = new Thread(mr);

        //启动线程
        t.start();

        for (int i=0;i<1000;i++){
            System.out.println("主线程" + i);
        }
    }
}

/**
 * 这不是一个线程类，只是一个可运行的类
 */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("分支线程" + i);
        }
    }
}

