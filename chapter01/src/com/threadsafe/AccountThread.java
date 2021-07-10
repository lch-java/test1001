package com.threadsafe;

import com.threadsafe.Account;

public class AccountThread extends Thread{
    //该类中有账户
   /* private Account account01;

    //通过构造方法获取该类账户
    public User01(Account account01) {
        this.account01 = account01;
    }

    public User01() {
    }

    @Override
    public void run() {

        double money = 5000;
        account01.getMoney(money);
        System.out.println(Thread.currentThread().getName()+"对"+account01.getActno() + "取款"+ money + "成功,余额:" + account01.getMoney());

    }*/

    // 两个线程必须共享同一个账户对象。
    private Account act;

    // 通过构造方法传递过来账户对象
    public AccountThread(Account act) {
        this.act = act;
    }

    public void run(){
        // run方法的执行表示取款操作。
        // 假设取款5000
        double money = 5000;
        // 取款
        // 多线程并发执行这个方法。
        act.withdraw(money);

        System.out.println(Thread.currentThread().getName() + "对"+act.getActno()+"取款"+money+"成功，余额" + act.getBalance());
    }






}
