package com.changyonglei.array;

/**
 * 二分法
 *二分法的使用是基于数据已经排好序的基础上进行查找的,作用:查找元素
 *从左往右数据递增排序,第一个元素下标是0,最后一个元素下标是length-1
 * 第一步:(0+length-1)/2 --->得出一个下标值,若是没有找到,继续执行,这个值取整
 * 第二步:初始下标变成[(0+length-1)/2] +1,继续和length-1相加除以2,得出一个下标值
 * 如此往复,直到找到这个元素为止
 *
 * java.util.Arrays是一个数组工具类
 * sort排序和binarySearch二分法,这两个方法调用的比较多
 * binarySearch是用来查询数组中有没有对应的元素的
 */
public class Arrays04 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays04 a = new Arrays04();
        int index = a.print(arr, 5);
        System.out.println(index == -1 ? "该元素不存在" : "该元素的下标是" + index );
    }

    public int print(int[] arr, int ints) {

        //自写的二分法
        //a表示初始下标,b表示结束下标
        int a = 0;
        int b = arr.length - 1;

        //c表示中间下标
        while(a<= b) {
            int c = (a + b) / 2;
            if (arr[c] == ints) {
                return c;
            } else if (arr[c] > ints) {
                b = c-1;
            } else{
                a = c+1;
            }
        }
        return -1;
    }
}


