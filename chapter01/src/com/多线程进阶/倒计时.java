package com.多线程进阶;

/**
 * 利用线程Thread的sleep方法完成简单的倒计时
 */
public class 倒计时 {
    public static void main(String[] args) throws InterruptedException {
        int num = Integer.parseInt(args[0]);

        while (true){
            System.out.println("倒计时" + num);
            num--;
            Thread.sleep(1000);
           if (num <0){
               //判断当前main线程是否处于活动状态
               System.out.println(Thread.currentThread().isAlive());    //true
               break;
           }
        }
        //正在执行这段代码本身，所以也是true
        System.out.println(Thread.currentThread().isAlive());   //true

    }
}
