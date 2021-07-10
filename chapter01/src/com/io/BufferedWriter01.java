package com.io;

import java.io.*;

/**
 * 带有缓冲的字符输出流
 * BufferedWriter构造方法中只能传入Writer类型的实参
 */
public class BufferedWriter01 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            //bw = new BufferedWriter(new FileWriter("myFile"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myFile",true)));
            bw.write("Hello World!");
            bw.write("\n");
            bw.write("Hello!" );

            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
