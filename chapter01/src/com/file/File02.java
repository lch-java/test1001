package com.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File常用方法 02
 */
public class File02 {
    public static void main(String[] args) {
        File f = new File("D:/desktop/String02.png");

        //判断是否是一个目录
        System.out.println(f.isDirectory());

        //判断是否是一个文件
        System.out.println(f.isFile());

        //获取文件最后一次修改时间,返回的是毫秒
        long l = f.lastModified();
        //long l1 = System.currentTimeMillis();

        Date date = new Date(l);
        //Date date1 = new Date(l1 - 24 * 60 * 60 * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd HH:mm:ss ");
        String s = sdf.format(date);
       //String s1 = sdf.format(date1);
        System.out.println(s);
        //System.out.println(s1);

        //获取当前文件多少字节
        System.out.println(f.length());




    }
}
