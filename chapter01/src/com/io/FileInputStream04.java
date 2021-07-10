package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream中的方法
 * void close()
 * int read()       返回的是字节本身
 * int read(byte b) 返回的是读到的字节数量
 * int available() 返回流当中剩余的没有读到的字节数量
 * long skip(long n) 跳过几个字节不读
 */
public class FileInputStream04 {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");
            int length = fis.available();   //直接获取该文件的字节数，传给byte数组
            byte[] bytes = new byte[length];

            int readCount = fis.read(bytes);    //读取到的字节数
            System.out.println(readCount);
            //此时无需用while循环
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
