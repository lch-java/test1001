package com.changyonglei.date;



/**
 * 获取从1970--01--01 00:00:00 000到当前系统时间的总毫秒数
 * 1s = 1000ms
 */
public class Date02 {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        System.out.println(beginTime);
        print();
        long overTime = System.currentTimeMillis();
        System.out.println("结束时间:" + overTime);
        System.out.println("耗费时间:" + (overTime - beginTime));

    }

    private static void print() {
        for(int i=0;i<1000;i++){
            System.out.println(i);

        }
    }


}
