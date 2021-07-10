package com.io.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static void log(String msg) throws FileNotFoundException {
        //创建一个PrintStream对象，并调用System.setOut()方法将输出方向改变日志文件中

            PrintStream ps = new PrintStream(new FileOutputStream("log",true));
            System.setOut(ps);
            ps.flush();
            //创建一个Date对象，通过格式化后获取当前时间
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");
            String s = sdf.format(date);

            System.out.println(s + "  " + msg);


    }
}
