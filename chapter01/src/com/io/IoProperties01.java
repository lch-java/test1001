package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * IO和Properties的联合应用
 * 经常用来读取配置文件(其中这个文件的格式是key1 = value1，key重复，value覆盖)
 * 我们把这种配置文件叫做属性配置文件，且这种文件一般以.properties后缀结尾(属性配置文件)
 * 而Properties对象是专门存储属性配置文件的一个类
 */
public class IoProperties01 {
    public static void main(String[] args) {
        /**
         * Properties是Map集合，且key和value是String类型，无初始化容量
         * 将userinfo文件的数据加载到Properties对象中，即将从硬盘到内存中，需要输入流
         */

        FileReader fr = null;
        try {
            //创建一个输入流对象
            fr = new FileReader("chapter01/userinfo.properties");

            //新建一个Properties集合
            Properties ppt = new Properties();
            //调用Properties中的load方法，将文件中的数据加载到Map集合中(文件顺着传进来的管道加载到内存中)
            ppt.load(fr);
            String s = ppt.getProperty("username");
            String s1 = ppt.getProperty("password");
            System.out.println(s);
            System.out.println(s1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
