package com.threadsafe;

import com.threadsafe.Account;
import com.threadsafe.AccountThread;

public class Test01 {


    public static void main(String[] args) {
        //Account account01 = new Account("act-001",10000);

       /* Thread t = new Thread(new User01(account01));
        Thread t1 = new Thread(new User01(account01));

        t.start();
        t1.start();*/

            // 创建账户对象（只创建1个）
            Account act = new Account("act-001", 10000);
            // 创建两个线程
            Thread t1 = new AccountThread(act);
            Thread t2 = new AccountThread(act);
            // 设置name
            t1.setName("t1");
            t2.setName("t2");
            // 启动线程取款
            t1.start();
            t2.start();

       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/



    }


}
