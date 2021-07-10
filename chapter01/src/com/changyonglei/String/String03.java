package com.changyonglei.String;

/**
 * String类中常用的构造方法
 * ①.String s1 = new String(" ");
 * ②.String s1 = " "; 最常用
 * ③.String s1 = new String(char数组);
 * ④.String s1 = new String(char数组,起始下标,length);
 * ⑤.String s1 = new String(byte数组);
 * ⑥.String s1 = new String(byte数组,起始下标,length);
 */
public class String03 {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1); //hello
        byte b = 97;
        System.out.println(b);  //97

        char c = 97;
        System.out.println(c);  //a,自动转成对应的解码的数据



        byte[] bytes = {48,49,50};

        System.out.println(bytes);      //内存地址

        //调用String这中的这种构造方法
        String s2 = new String(bytes);
        System.out.println(s2.toString());  //0 1 2

        //调用String这中的这种构造方法,String(字节数组,数组元素下标的起始位置,传的长度)
        String s3 = new String(bytes,1,2);
        System.out.println(s3); //1 2

        //将char字组全部转成字符串
        //将char字组一部分转成字符串
        char[] chars = {'我','是','中','国','人'};
        System.out.println(chars);  //我是中国人
        //调用String这中的这种构造方法,String(char数组,数组元素下标的起始位置,传的长度)
        String s4 = new String(chars,2,3);
        System.out.println(s4);     //中国人


    }

}
