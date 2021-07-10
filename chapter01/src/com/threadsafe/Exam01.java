package com.threadsafe;

/**
 * synchronized关键字的理解
 */
public class Exam01 {
    public static void main(String[] args) {
        //创建一个MyClass对象
        MyClass mc = new MyClass();
        MyClass mc1= new MyClass();
        //创建两个线程对象
        MyThread0 t1 = new MyThread0(mc);
        MyThread0 t2 = new MyThread0(mc1);

        //设置线程对象的名字
        t1.setName("t1");
        t2.setName("t2");

        //启动线程
        t1.start();
        //这个休眠的作用就是保证t1线程先执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}

class MyThread0 extends Thread{
    private MyClass mc;

    public MyThread0(MyClass mc){
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}




class MyClass {
    //这种锁的是当前对象(对象级的锁)
    public synchronized void doSome(){
        System.out.println("doSome begin!");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over!");
    }

    public synchronized void doOther(){
        System.out.println("doOther begin!");
        System.out.println("doOther over!");
    }

}
