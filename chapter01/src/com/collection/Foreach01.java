package com.Collection;

import java.util.Arrays;

/**
 * JDK5.0之后推出增强for循环，即foreach
 */
public class Foreach01 {
    public static void main(String[] args) {
        int[] arr = {1,23,42,212,34,12};

        Arrays.sort(arr);
        Arrays.binarySearch(arr,2);
        //普通for循环
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //增强for循环
        //语法格式
       /* for (元素类型 变量名 : 数组或集合) {
            System.out.println(变量名);
        }*/
        for (int i: arr
             ) {
            System.out.println(i);
        }
    }
}
