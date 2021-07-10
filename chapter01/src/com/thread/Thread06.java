package com.thread;
/**
 * 关于线程中的static void sleep()方法的面试题
 */
public class Thread06 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("分支线程01");
        //启动分支线程01
        t.start();

        try {
            t.sleep(1000 * 5);  //这里不会使分支线程01进入休眠状态，与new出来的线程对象无关，它是一个静态方法，相当于还是在
            //main线程中调用了这个方法，所以main线程会休眠5s
            System.out.println("Hello");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
