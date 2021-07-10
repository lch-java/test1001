package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 改进while循环
 */
public class FileInputStream02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //空格也是一个字符，对应的ASCII码是32
        int byteDate =0;
        try {
            fis = new FileInputStream("D:/Desktop/JAVASE/temp");
            //int byteDate = 0;
            while ((byteDate = fis.read()) != -1) {
                System.out.println(byteDate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
