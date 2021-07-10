package com.thread;

/**
 * 线程的优先级(了解内容)
 */
public class Thread10 {
    public static void main(String[] args) {
        Thread t = new Thread();
        MyThread04 mt04 = new MyThread04();
        System.out.println(t.getPriority());        //5
        t.setPriority(1);
        mt04.setPriority(10);
        //启动mt04线程
        mt04.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "主线程" + i);
            try {
                Thread.sleep(1000 * 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

class MyThread04 extends Thread{
    @Override
    public void run() {
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "分支线程" + i);
            try {
                Thread.sleep(1000 * 2 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}