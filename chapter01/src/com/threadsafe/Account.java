package com.threadsafe;

public class Account {
 /*   //账号
    private String actno;
    //账户余额
    private double money;

    public Account01() {
    }


    public Account01(String actno,double money) {
        this.actno = actno;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    //账户更新方法
    public String depositMoney(double cash){

        this.money = cash + money;
        return "存款成功";
    }

    public void getMoney(double cash){
       *//* if (cash > money){
            return "账户余额不足";
        }*//*
        double before = this.getMoney();
        double after = before - cash;
        setMoney(after);

    }*/
    // 账号
    private String actno;
    // 余额
    private double balance;
    //对象
    Object obj = new Object();

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    public void withdraw(double money) {
        /**
         * 用同步机制解决多线程并发环境下的安全问题
         *  synchronized(只能写线程共享的数据，想让哪些线程排队就写上它们共享的数据){
         *     同步代码块
         *     }
         * 这里的共享数据是Account对象，所以用this,也可以用在该共享数据中的某一个Java对象
         * 且这个对象必须要满足是实例的，因为这个对象一定要在堆/方法区中，因为
         * 只有这两个内存中的数据是共享的，所以这里synchronized()中还可以写成obj，某个字符串
         * 对象，因为字符串对象都是在方法区的常量池中，且具有唯一性，但此时表示的是对所有线程共享
         * 同步代码块
         * 不能写null，否则出现NullPointerException
         * 同步代码块中的内容越少，效率就越高，反之就会越低
         *
         */
        synchronized (obj) {
            // t1和t2并发这个方法。。。。（t1和t2是两个栈。两个栈操作堆中同一个对象。）
            // 取款之前的余额
            double before = this.getBalance(); // 10000
            // 取款之后的余额
            double after = before - money;


            // 在这里模拟一下网络延迟，100%会出现问题
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            // 更新余额
            // 思考：t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。此时一定出问题。
            this.setBalance(after);
        }
    }
}
