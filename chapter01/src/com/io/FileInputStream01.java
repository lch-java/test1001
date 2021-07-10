package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件字节输入流、万能流，任何文件都可以采用这个流来读
 * 缺点:效率低,内存和硬盘交互的太频繁，一次读取一个字节
 */
public class FileInputStream01 {
    public static void main(String[] args) {
        //第一步：准备一个文件,文件路径 D:\Desktop\JAVASE\temp，idea会自动将\转成\\，Java中\表示转义
        // 然后创建一个文件字节输入流对象
        //这两种都是绝对路径
        //D:\\Desktop\\JAVASE\\temp 等同于 D:/Desktop/JAVASE/temp
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("D:\\Desktop\\JAVASE\\temp");
             int i = fis.read();    //这个方法读取到的是"字节本身",a对应97
            System.out.println(i);
            i = fis.read();
            System.out.println(i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句块中确保流一定关闭
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
