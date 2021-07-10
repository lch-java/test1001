package com.changyonglei.array;

/**
 * 动静态初始化方式的选择：
 * ①、已知要在数组中存储的元素时，用静态初始化
 * ②、暂时不知道要在数组中存储哪些元素时，用动态初始化
 */
public class Array02 {
    public static void main(String[] args) {
        int[] array02 = new int[4];
        //遍历
        for (int i =0;i<array02.length;i++) {
            System.out.println("下标为" + i + "时,元素值为" + array02[i]);
        }
        //动态初始化
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] obj = new Object[3];
        //静态初始化
        Object[] obj01 ={new Object(),new Object(),new Object()};
        for (int i =0;i< obj.length;i++) {

            System.out.println(obj[i]);

        }

    }
}