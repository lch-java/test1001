package com.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * int read() 读到的是字节本身
 * int read(byte[] b) 返回的是读到的字节数量
 * 通过byte集合遍历得知，此方法读取的也是字节本身，但可通过String(byte,offset,length)
 * 构造方法的底层实现将其转成字符串类型的原文本输出
 * 一次最多读取b.length个字节
 * 减少硬盘和内存的交互，提高程序的执行效率
 * 往byte[]数组中读
 * idea中默认的当前路径就是project的根
 */
public class FileInputStream03 {
    public static void main(String[] args) {

        byte[] bytes = new byte[4];
        FileInputStream fis = null;
        try {
            /**
             * 最终版
             */
            //相对路径
            fis = new FileInputStream("myFile");

            int readCount = 0;

            while((readCount=fis.read(bytes)) != -1) {
                //将byte数组转成字符串 通过String的byte构造方法
                //从零开始读，读到多少个输出多少个

                System.out.print(new String(bytes, 0, readCount));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
