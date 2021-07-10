package com.thread;

/**
 * 获取、修改线程对象的名字
 * Thread类中的方法
 * setName(String name) 设置线程的名字
 * String getName() 获取线程的名字
 * static Thread currentThread() 获取当前线程对象
 */
public class Thread04 {

    public static String doSome(){
        return Thread.currentThread().getName();
    }
    public static void main(String[] args) {
        //哪个线程去调用就返回的是哪个线程对象
        System.out.println(doSome());

        //这个方法出现在main方法中，所以这个t就是主线程
        //这个方法出现在哪个线程中，返回的就是哪个线程
        Thread t = Thread.currentThread();
        t.setName("main");
        System.out.println(t.getName());  //默认主线程名字是main

        //创建一个线程对象
        MyThread02 mt = new MyThread02();


        //获取下线程的名字
        String s = mt.getName();
        System.out.println(s);

        //设置线程的名字
        mt.setName("mt");
        //重新获取线程的名字
        String s1 = mt.getName();
        System.out.println(s1);

        //启动线程
        mt.start();

    }
}

class MyThread02 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "分支线程" + i);
        }
    }
}
