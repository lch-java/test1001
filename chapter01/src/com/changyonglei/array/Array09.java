package com.changyonglei.array;

/**
 * 动态初始化二维数组
 */
public class Array09 {
    public static void main(String[] args) {
        //动态初始化二维数组,3行4列
        int[][] a = new int[3][4];  //表3个一维数组,且每个一维数组都有4个元素

        //二维数组的遍历
        //二维数组的引用[二维下标]指的是该二维数组中的第下标个元素(即一维数组)
        for (int i =0;i< a.length;i++){
            for (int j =0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        printArray(new Array09[2][4]);  //多态
        printArray(new Object[][]{{1,2,3},{4,5,6},{7,8,9}});
    }


    //二维数组遍历的静态方法
    public static void printArray(Object[][] obj){
        for (int i = 0; i< obj.length; i++){
            for (int j = 0; j<obj[i].length; j++){
                System.out.print(obj[i][j] + " ");
            }
            System.out.println();
        }
    }





}
