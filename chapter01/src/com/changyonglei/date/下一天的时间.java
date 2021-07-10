package com.changyonglei.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 下一天的时间 {
    public static void main(String[] args) {

        System.out.println(nextTime());
    }
    public static String nextTime(){
        long nextDayTime = (System.currentTimeMillis()+ 24*60*60*1000 );
        Date date = new Date(nextDayTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");
        return sdf.format(date);


    }
}
