package com.changyonglei.array;

/**
 * 二维数组是实际上是一个特殊的一维数组,即在二维数组中的每一个元素都是一个数组
 * 三维数组是一个特殊的二维数组
 * ............
 */
public class Array07 {
    public static void main(String[] args) {
        //一维数组
        int[] a01 = {1,424,45};
        //静态初始化二维数组,每个元素都是一个一维数组

        int[][] a = {
                {1,34,6},
                {23,56,653,4},
                {4,5,2}
        };
        System.out.println(a.length);//输出的是二维数组的长度
        System.out.println(a[0]);//输出的是一维数组对象的内存地址
        System.out.println(a[1]);//输出的是一维数组对象的内存地址
        System.out.println(a[0].length);
    }
}
