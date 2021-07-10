package com.threadsafe;

/**
 * 死锁
 * 死锁很难调试，因为没有异常提示，也没有错误，程序会一直僵持在那里
 * synchronized最好不能用嵌套，可能发生死锁现象
 */
public class DeadLock {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new MyThread05(o1,o2);
        Thread t2 = new MyThread06(o1,o2);

        t1.start();
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t2.start();
    }
}

class MyThread05 extends Thread{
    Object o1;
    Object o2;

    public MyThread05(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized(o1){
            System.out.println(Thread.currentThread().getName() + "已锁o1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "已锁o2");
            }
        }
    }
}
class MyThread06 extends Thread{
    Object o1;
    Object o2;

    public MyThread06(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized(o2){
            System.out.println(Thread.currentThread().getName() + "已锁o2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + "已锁o1");
            }
        }
    }
}
