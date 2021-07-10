package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader带有缓冲区的字符输入流,构造方法中只能传入Reader类型的实参
 * 使用这种的话，就不用自己new一个数组传进去了
 * 构造方法是传一个Reader对象
 * 特有的方法String readLine()读取一个文本行,更方便,这个方法读取不到换行符
 *
 */
public class BufferedReader01 {
    public static void main(String[] args) {
        FileReader fr = null;
        //当一个流的构造方法中需要一个流时，这个被传进的流是节点流，外面包装的流是包装流/处理流
        BufferedReader br = null;
        try {
            fr = new FileReader("chapter01/src/com/io/Copy02.java");
            //第一行,读取到文本末尾时会返回null
            /*String firstLine = br.readLine();
            System.out.println(firstLine);*/

             br = new BufferedReader(fr);
            String line = null;

            //循环读取,读取到文本末尾时会返回null，所以可以用while循环
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    //对于包装流来说，只需关闭包装流，里面的节点流底层代码会自动关闭
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
