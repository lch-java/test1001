package com.changyonglei.integer;

/**
 * Integer包装类(八种包装类都只有两种)中构造方法有两种
 * 常用的方法
 * parseInt(String str)返回值是int类型,将String--->int
 *
 */
public class Integer03 {
    public static void main(String[] args) {
        //static int parseInt(String s)
        //传参String，返回int
        //作用：将字符串转换成int类型输出,同样参数只能是int类型的数据，不能是别的类型，否则数字格式化异常
        //用在网页中，我们在网页文本框中输入数字时实际上是输入100这个字符串，但数据库中要求存储100这个数字
        //此时Java程序需要将"100"转化成100这个数字
        System.out.println(Integer.parseInt("1"));
    }
}
