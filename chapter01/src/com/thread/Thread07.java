package com.thread;

/**
 * 怎么让一个在休眠状态的线程恢复
 */
public class Thread07 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable02());

        t.start();

        //运用异常处理机制，结束try中的sleep方法，抛出异常，继而输出下面的Java语句
        //若是不想打印堆栈异常追踪信息，将printStackTrace注释掉即可
        t.interrupt();

    }
}

class MyRunnable02 implements Runnable{


    //重写Runnable接口中的run方法时，当中的异常只能try..catch，不能throws抛出，因为源run方法没有
    //抛出任何异常，又因为子类重写父类中的方法时不能抛出更多的异常，所以这里只能try catch
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始执行");
        try {

            Thread.sleep(1000 * 5) ;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "结束执行");


    }
}


