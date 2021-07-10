package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符输出流，负责写，只能写普通文本文件
 * 中英文都可以直接写
 */
public class FileWriter01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //创建一个文件输出流
            fw = new FileWriter("myFile",true);
            String s = "我的是 阿萨";
            String s1 = "ad112";
            fw.write(s1);

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
