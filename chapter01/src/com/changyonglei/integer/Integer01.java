package com.changyonglei.integer;

import static sun.misc.Version.print;

/**
 * Java中为八种基本数据类型准备了八种包装类型，八种包装类属于引用数据类型，父类是object
 * 八种包装类型的作用：object的变量作为形参时，只能传所有的引用数据类型，但是八种基本数据类型不能作为实参传进去，
 * 这时可以创建基本数据类型的类来创建对象，将对象传进去就可以了，并且需要在基本数据的类中重写toString方法，否则输出的就只是一个
 * 内存地址
 * 八种基本数据类型对应的包装类：
 * java.lang.Byte
 * java.lang.Short
 * java.lang.Integer
 * java.lang.Long
 * java.lang.Float
 * java.lang.Double
 * java.lang.Boolean
 * java.lang.Character
 * 六种数字的包装类对应的父类都是java.lang.Number(抽象类)
 * Number中的方法:
 * byteValue(); 以byte的形式返回指定的值
 * shortValue();    ....
 * intValue();
 * longValue();
 * floatValue();
 * doubleValue();
 * 其他两种的父类则是Object
 *
 */
public class Integer01 {
    public static void main(String[] args) {

        MyInt myInt = new MyInt(10);
        System.out.println(print(myInt));

        //装箱:基本数据类型---->引用数据类型
        Integer i  = new Integer(1);


        //拆箱:引用数据类型---->基本数据类型
        float f = i.floatValue();
    }

    public static Object print(Object obj) {
        return obj;
    }


}

class MyInt {
    private int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
