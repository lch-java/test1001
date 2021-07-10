package com.changyonglei.integer;

/**
 *NumberFormatException 数字格式化异常
 * NullPointerException 空指针异常
 * ClassCastException   类型转换异常
 * ArrayIndexOutOfBoundsException   数组下标越界异常
 * 栈溢出是错误，不是异常
 */
public class Integer02 {
    public static void main(String[] args) {
        //以Integer包装类为例，其他包装类相似
        //将数字int类型数字1转换成Integer类型
        Integer i = new Integer(1);
        //将字符串类型的数字23转换成Integer包装类
        //这种构造方法的字符串不能为中文，否则运行会报错，编译不会报错
        Integer i1 = new Integer("2");


        System.out.println(i);
        System.out.println(i1);

        //包装类最大/最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);

    }
}