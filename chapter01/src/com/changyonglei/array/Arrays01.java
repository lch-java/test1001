package com.changyonglei.array;

/**
 * Java.util.Arrays
 * Java 类库中提供了一个数组工具类Arrays,这种类中的方法大多是静态
 * Arrays工具类
 * 不用精通算法,理解就行,开发用不到,因为可以直接用sun公司的工具类Arrays里的方法
 * @学习:冒泡排序算法:整数型一维数组元素的排序,
 * 要进行数组length-1次的循环,每次循环都要比较参与的数据-1次
 * 每一次循环都会找出最大值,下一次循环就会把最大值排除在外进行比较,直到最后一轮只剩两个元素进行比较后才停止
 * 一次循环中元素比较的规律:
 * 从第一个元素值和第二个元素值进行比较,大的右移,然后第三个和第二个进行比较,依此类推
 * @作者:86159
 * @时间:2021.3.22
 * Ⅰ数组常见的算法:
 * ①:排序算法----冒泡排序算法和选择排序算法
 * Ⅱ 查找算法
 * 二分法查找
 */

public class Arrays01 {
    private int[] ints;
    private int index;

    //构造方法
    public Arrays01() {
    }

    public Arrays01(int[] ints) {
        this.ints = ints;
        this.index = 0;
    }

    //setter和getter方法
    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //冒泡方法
    public void sort01(){
        //冒泡排序的外层循环length-1次
       for (int i=ints.length-1;i>0;i--){
           //里层循环,第一次比较第一次循环的i次,第二次比较第二次循环的i次
           //冒泡排序核心:将比较的最大值排到最后一个位置
           for (int j=0;j<i;j++){
               if (ints[j]>ints[j+1]){
                   int temp;
                   temp = ints[j];
                   ints[j] = ints[j+1];
                   ints[j+1] = temp;
               }
           }
       }

    }



    public static void main(String[] args) {
        /*int[] array01 = {1,52,456,56,32};
        //直接调用工具类Arrays中排序的方法
        Arrays.sort(array01);
        for (int i=0;i<array01.length;i++){
            System.out.println(array01[i]);

        }*/

        Arrays01 a = new Arrays01(new int[]{1,3,6,67,4,7,656});
        a.sort01();
        for(int i = 0;i<a.getInts().length;i++) {
            System.out.println(a.getInts()[i]);
        }




    }



}
