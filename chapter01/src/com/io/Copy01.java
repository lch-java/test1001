package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *使用FileInputStream和FileOutputStream完成文件的拷贝
 * 拷贝的过程是一边读一边写
 * 使用以上字节流拷贝文件的时候，文件的类型随意
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\Desktop\\IO流.png");  //输入流对象
            fos = new FileOutputStream("D:\\IO流.png"); //输出流对象
            /**
             * 核心
             */
            byte[] bytes = new byte[1024 * 1024];   //一次读1M
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }

            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
