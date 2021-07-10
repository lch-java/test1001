package com.changyonglei.stringbuffer;



/**
 * 字符串是不可变的，每一次字符串的拼接都会有新的字符串生成
 * 字符串的频繁拼接会很浪费方法区的内存空间
 * 字符串的频繁拼接可以用JDK自带的：
 * java.lang.StringBuffer
 * java.lang.StringBuilder
 * 两个用法都一样
 * StringBuffer是线程安全的
 * StringBuilder是非线程安全的
 * lang包中自带的Java源文件不用import可以直接拿来用，仅限lang包，lang包中的子目录也不行
 * 所以这里可以创建StringBuffer的对象
 */
public class StringBuffer01 {
    /**
     * JDK13中的StringBuffer底层实际上是一个byte[]数组，JDK8中则是char[]数组
     * StringBuffer的初始化容量都是16
     * append 附加、追加
     * capacity 容量、容积
     * 往StringBuffer中存数据就是往数组里存数据
     *
     * 默认16个数据存满会自动扩容
     * 在创建StringBuffer对象的时候尽量给定一个初始化容量，依此减少StringBuffer扩容的操作
     * 扩容次数越少，效率越高
     */
    public static void main(String[] args) {
        //StringBuffer对象指的是字符串缓冲区对象
        //JDK8中就是创建了一个char类型的数组
        StringBuffer s = new StringBuffer();
        byte[] chars = {48,97,'a'};
        System.out.println(chars[2]);
        String s1 =  new String(chars,0,3);
        System.out.println(s1);
        char c = '\u0000';
        System.out.println('\u0000');
        s.append(1);
        s.append("a");
        s.append(97);
        s.append(48);
        s.append("我很中意你啊");
        s.append("-2147483648");
        System.out.println(s);  //1a9748我很中意你啊

    }

}
