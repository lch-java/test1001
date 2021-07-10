package com.thread;

/**
 * 实现多线程的第一种方式
 * 编写一个类，继承Thread，重写run方法
 */
public class Thread01 {
    public static void main(String[] args) {

        //启动线程的步骤
        //①、创建一个线程对象
        MyThread myThread = new MyThread();

        //②、调用继承来的start方法，作用:在JVM中开辟一个新的栈空间，这段代码瞬间就会结束
        //且只要栈空间开辟出来，线程就算是启动成功了，启动线程后JVM会自动调用run方法，run此时在分支栈的栈底部
        //而main方法在主线程的栈底部，run方法和main方法两个是平级的
        myThread.start();

        //这后面的代码仍然是在主线程main方法中执行
        for (int i=0;i<1000;i++){
            System.out.println("主线程" + i);
        }

        /**
         * 这里输出的结果有先有后，有多又少是因为两个线程在争取执行权，而控制台只有一个
         */
    }
}

/**
 * 定义线程类
 */
class MyThread extends Thread{
    @Override
    public void run() {

        for (int i=0;i<1000;i++){
            if (i % 10 ==0) {
                Thread.yield();
            }
            System.out.println("分支线程" + i);
        }
    }
}
