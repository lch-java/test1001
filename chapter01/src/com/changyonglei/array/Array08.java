package com.changyonglei.array;

public class Array08 {
    public static void main(String[] args) {
        int[][] a ={{1,3,5},{2,4,6,8}};
        int[] a01 = a[0];//二维数组中的第一个一维数组对象的内存地址赋值给a01变量

        System.out.println(a01[0]);
        System.out.println(a[0][0]);//等同于下面的表达式,输出第一个元素的第一个值
        System.out.println(a01[0]);//等同于上面的表达式,输出第一个元素的第一个值

        //二位数组的遍历
        for (int i =0;i<a.length;i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

