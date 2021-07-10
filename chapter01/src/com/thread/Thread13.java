package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask; //JUC包下的属于Java并发包，老JDK中没有

/**
 * 实现线程的第三种方式，若是要获取到某个线程的返回值就采用这种方式去,但效率低，有点像Thread中的void join()方法,当前线程阻塞，
 * 别的线程先执行完，才会轮到当前线程去执行。
 * call方法相比run方法，有Object类型的返回值，且可抛出异常
 * 而run方法返回的void空的，且只能抓住异常
 */
public class Thread13 {
    public static void main(String[] args) {
        //这里的参数只能是Callable实现类对象，这里用到了匿名内部类
        //和实现Runnable接口的用法一样，task需要传到Thread的构造方法中
        //一个未来任务对象

        FutureTask task = new FutureTask(new Callable(){
            //call方法相当于run方法，只不过这里有返回值
            @Override
            public Object call() throws Exception {
                System.out.println("call begin");

                int i,j;
                i = 10;
                j = 11;
                Thread.sleep(1000 * 10);

                System.out.println("call over");

                return i + j;


            }
        });

        //创建线程对象
        Thread t = new Thread(task);

        //启动线程
        t.start();

        //获取t线程的返回值
        try {
            //这个get()方法会引起main(当前)线程阻塞，因为要等待t线程执行完call方法,才能获取到这个返回值,效率低
            Object obj = task.get();
            System.out.println(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}


