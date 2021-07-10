package com.thread;

/**
 * Object类中的wait方法和notify方法
 * 在Java中，任何一个Java对象都有这两个方法，因为Object是所有类的父类
 * void wait()的作用:
 * Object obj = new Object();   obj是一个封装后的对象(实际上是一个对象的引用)，是被共享的数据，
 * 此new 出来的是自定义的类，只是拿Object类来举个例子
 * 这里说的obj其实是一个共享的数据对象，就是一个封装的类对象，因为wait和notify方法都是建立在synchronized基础上的
 * obj.wait() 表示在obj对象上活动的线程进入无期限等待状态，直到被唤醒为止（在obj对象上活动的线程表示的是当前线程）
 * 并且释放掉当前线程占有obj对象的锁
 * obj.notify()的作用:唤醒当前obj对象在等待的线程对象
 *
 *                                      生产者和消费者模式
 * 使用wait方法和notify方法实现生产者和消费者模式
 * 生产线程负生产，消费线程负责消费
 * 生产线程和消费线程要达到均衡
 * 这是一种特殊的业务需求
 * wait方法和notify方法建立在线程同步的基础上，因为多线程同时操作一个仓库，有线程安全问题
 */
public class Thread14 {
}
