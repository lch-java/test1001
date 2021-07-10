package com.thread;

/**
 * Java中线程的强行终止
 *   t.stop(); 已过时，会直接关掉线程，不建议使用，会导致线程中的数据直接丢失
 */
public class Thread08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable03());

        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程执行");
        //t.stop(); //已过时，会直接关掉线程，不建议使用，会导致线程中的数据直接丢失


    }

}
class MyRunnable03 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "分支线程" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}