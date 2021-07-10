package com.changyonglei.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws Exception{
        //精确到毫秒的系统当前时间
        //直接调用Date类的无参构造就可
        Date nowTime = new Date();
        //toString方法已经在Date类中重写
        System.out.println(nowTime);    //Fri Mar 26 20:05:03 CST 2021

        //对日期进行格式化会用到SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");

        String str = sdf.format(nowTime);
        System.out.println(str);    //2021--03--26 20:04:43

        //Date---->String,格式要和SimpleDateFormat相同
        String time = "2017--07--01 08:00:00 ";
        Date time01 = sdf.parse(time);
        System.out.println(time01);

    }


}
