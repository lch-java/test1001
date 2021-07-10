package com.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 验证反射机制建对象的灵活性(符合OCP原则，对扩展开放，对修改关闭)
 * 高级框架底层是通过反射机制来实现的
 */
public class Reflect03 {
    public static void main(String[] args) {
        /**
         * 通过io流读取classinfo.properties文件
         */

        //建一个输入流
        FileReader fr =null;
        try {
             fr = new FileReader("chapter01\\classinfo.properties");

            //建一个properties对象
            Properties p = new Properties();
            //将指定文件的内容加载到该集合对象中
            p.load(fr);

            /**
             * 批量实例化对象
             */
            int i =-1;
            while (i< p.size()-1){
                i++;
                String s = p.getProperty("className" + i);
                System.out.println(s);

                //通过反射机制实例化User对象,这里可以通过修改指定文件的内容，来实例化不同类型的对象,不用修改源代码
                Class c = Class.forName(s);

                Object obj = c.newInstance();
            }
           /* String s = p.getProperty("className0");
            System.out.println(s);

            //通过反射机制实例化User对象,这里可以通过修改指定文件的内容，来实例化不同类型的对象,不用修改源代码
            Class c = Class.forName(s);

            Object obj = c.newInstance();*/



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
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
