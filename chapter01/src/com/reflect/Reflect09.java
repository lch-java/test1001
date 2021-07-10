package com.reflect;

/**
 * 可变长度参数
 */
public class Reflect09 {
    public static void main(String[] args) {
        //执行结果都一样，这里的参数个数是0-N个
        m();
        m(1);
        m(1,2,213);

        //将传入的参数作为一个数组输出
        //m2("ab","cd");    //ab,cd
        m2(2,3);    //2,3
    }

    private static void m2(int... args) {
        for (int i=0;i< args.length;i++){
            System.out.println(args[i]);
        }
    }

    /**
     * 可变长度参数在形参列表中有且只能有一个，且只能是最后一个
     * 且传的实参可以是0-N个
     * 语法:类型... 变量  (一定要3个. )
     * @param args
     * 可变长度参数可以当作一个数组来看待，因为它有length属性
     */
    public static void m(int... args){
        System.out.println("m method begin");

    }
}
