package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader、FileWriter进行文件的拷贝
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("D:\\desktop\\io流01.txt");
            fw = new FileWriter("D:\\io流01.txt");
            char[] chars = new char[10];
            int readCount = 0;
            while ((readCount = fr.read(chars)) != -1){
                //边读边写
                fw.write(chars,0,readCount);
            }

            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
