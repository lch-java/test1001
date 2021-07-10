package com.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Reflect05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
       /* //类路径默认是src
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo02.properties").getPath();

        //创建一个文件字节输入流
        FileReader fr = new FileReader(path);*/

        //上面的两行代码可以合并成一行
        InputStream fr = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo02.properties");

        //创建一个Properties集合
        Properties ppt = new Properties();

        //加载到ppt集合对象中
        ppt.load(fr);

        fr.close();

        //调用Properties中的getProperty方法，通过key获取value,这里的value是一个完整类名，所以再利用反射机制来创建一个实例对象
        String s = ppt.getProperty("className0");

        //forName方法底层实际上执行的是对应类的静态代码块
        Class c = Class.forName(s);

        //实例化一个对象
        Object obj = c.newInstance();
    }
}
