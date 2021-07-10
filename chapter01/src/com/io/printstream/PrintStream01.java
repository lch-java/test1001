package com.io.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream标准输出流
 * 不用手动关闭
 * System.out实际上拿到的是PrintStream标准输出流的一个实例，再通过实例去调用该流中的println方法
 */
public class PrintStream01 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.println(1);
        ps.println(2);
        ps.println(3);

        //修改输出的方向  控制台--->myFile
        try {
            PrintStream ps1 = new PrintStream(new FileOutputStream("myFile"));
            //static void setOut(PrintStream ps)改变输出的方向方法 该方法在System中
            System.setOut(ps1);
            System.out.println("我爱你");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
