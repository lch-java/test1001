package com.io;

import java.io.*;

/**
 *
 */
public class BufferedReader02 {
    public static void main(String[] args) {
        /*FileInputStream fis = null;
        BufferedReader br = null;*/
        BufferedReader br = null;
        try {
            /*fis = new FileInputStream("chapter01/src/com/io/Copy02.java");

            //创建一个字节-->字符转换流对象，在这里fis是节点流，isr是包装流
            InputStreamReader isr = new InputStreamReader(fis);

            //创建一个包装流对象，在这里isr是节点流，br是包装流[包装流和节点流是相对而言的]
             br = new BufferedReader(isr);

            br = new BufferedReader(new InputStreamReader(fis));*/

            br = new BufferedReader(new InputStreamReader(new FileInputStream("chapter01/src/com/io/Copy02.java")));
             String s = null;
             while ((s = br.readLine()) != null){
                 System.out.println(s);

             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
