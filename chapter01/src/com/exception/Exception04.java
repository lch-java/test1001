package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * finally
 * 必须和try连用，不能单独出现
 *finally中的代码是一定会执行的,就算try中出了异常，finally也会执行
 * finally通常用来对资源的释放
 */
public class Exception04 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            //创建输入流
            fis = new FileInputStream("D:\\Desktop\\JAVASE\\异常\\UML和异常.txt");
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (fis != null){
                    try {
                        //关闭输入流
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }


    }

}
