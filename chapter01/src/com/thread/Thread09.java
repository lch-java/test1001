package com.thread;

/**
 * 合理的终止一个线程
 * 结束/终止run方法的执行即可
 */
public class Thread09 {
    public static void main(String[] args) {

        MyRunnable04 r = new MyRunnable04();
        Thread t = new Thread(r);

        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程开始");
        r.run = false;

    }
}

class MyRunnable04 implements Runnable{
   //打一个boolean标记
    boolean run = true;
    @Override
    public void run() {

        for (int i=0;i<10;i++){
            if (run){
                try {
                    System.out.println(Thread.currentThread().getName() + "分支线程" + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                return;
            }
        }
    }
}
