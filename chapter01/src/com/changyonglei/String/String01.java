package com.changyonglei.String;

/**
 * 在Java中随便用双引号括起来的都是String类的对象
 * Java中规定,用双引号括起来的字符串是不可变的
 * 在JDK中,双引号括起来的字符串,例如:"abc"都是存储在方法区的"字符串常量池"中
 * 因为字符串太常用,所以会被存到"方法区常量池"中
 * 若在方法区常量池中已有某个字符串,在别的Java语句中若是用到这个字符串时,此时不会去创建一个新的重复的字符串对象,而是直接去调用
 * 在方法去常量池中已有的那个字符串对象
 */
public class String01 {
    public static void main(String[] args) {
        //这两行代码创建了三个字符串对象存储在方法区常量池中,其中"xy"这个字符串对象没有引用,
        //"abcdef"对应的引用是s1,"abcdefxy"对象对应的引用是s2
        String s1 = "abcdef";
        String s2 = "abcdef" + "xy";

        //右边表达式先执行,在堆内存中创建了一个String对象,这个String对象里存了一个"xy"对象的内存地址
        //再将String对象的内存地址赋给s3
        String s3 = new String("xy");

        //i中存的是10,但是上面的s1存的是"abcdef"对象的内存地址
        int i = 10;

    }
}
