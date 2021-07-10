package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输流，负责写，从内存到硬盘
 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //myfile文件不存在的话会自动新建,没有true的话，会清空文件内容再进行写
            //构造方法中若加了true，则会往文件里添加数据
            fos = new FileOutputStream("myFile");
            byte[] bytes = {65,66,67,68,69};

            //将byte数组全部写出
            fos.write(bytes);

            //将byte数组部分写出
            fos.write(bytes,0,2);

            String s = "我爱你";
            byte[] bs = s.getBytes();
            fos.write(bs);

            fos.flush(); //更新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
