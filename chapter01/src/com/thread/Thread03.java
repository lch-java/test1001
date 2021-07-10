package com.thread;

/**
 * 采用匿名内部类的方式
 * 匿名内部类new 接口
 */
public class Thread03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {

            }
        });


    }
}
