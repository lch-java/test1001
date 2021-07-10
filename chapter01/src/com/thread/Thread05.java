package com.thread;

/**
 * Thread线程中的sleep方法
 * static void sleep(long millis)
 * 作用:让当前线程进入休眠状态，即"阻塞状态"，放弃抢到的CPU时间片，让给其他的线程
 * 这行代码出现在哪个线程中，哪个线程就会进入休眠状态
 *
 * 通俗得说作用就是可以让代码间隔多长时间去执行
 * 并且再代码执行时，可以让其间隔某个特定的时间再执行下一段代码
 */
public class Thread05 {
    public static void main(String[] args) {

        //当前(主线程)线程进入休眠5秒
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5s后才会在控制台上执行Hello world!
        System.out.println("Hello world!");


    }
}
