package com.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *使用定时器指定定时任务
 */
public class Thread12 {
    public static void main(String[] args) {
        //创建一个定时器对象
        Timer timer = new Timer();


        //void schedule(TimerTask task, Date firstTime, long period)
        // task表示定时任务，firstTime表示第一次执行时间，间隔多久执行一次(period表示毫秒数)
        //TimerTask已经实现了Runnable接口

        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");

        Date date = null;
        try {
            date = sdf.parse("2021--04--16 21:13:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

         TimerTask ltt = new LogTimerTask();
        /**
         * ltt 表示要执行的任务
         * date表示第一次执行的时间
         * 后面的是执行间隔的时间，单位是毫秒数
         */
        timer.schedule(ltt,date,1000 * 10 );


    }
}

class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date + ":成功完成一次数据备份");
    }
}
