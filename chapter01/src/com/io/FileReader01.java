package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件字符输入流，只能读取普通文本文件
 * 读取普通文本文件方便快捷
 * 中英文都可以直接读
 */
public class FileReader01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            //创建文件字符输入流
            fr = new FileReader("myFile");

            char[] chars = new char[4]; //一次读取四个字符
            int readCount = 0;
            while ((readCount = fr.read(chars)) != -1){
                System.out.print(new String(chars,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
