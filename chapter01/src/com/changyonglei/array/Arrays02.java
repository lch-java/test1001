package com.changyonglei.array;

/**
 * @学习:选择排序算法
 * 两种算法的比较次数是一样的,但交换位置的次数减少了,相比冒泡算法更加有效的进行数据位置的交换
 */
public class Arrays02 {
    public static void main(String[] args) {
        //一维数组
        int[] array01 = {1,3,545,23,432,123,34};

        //外层循环,循环length-1次
        for (int i=0;i<array01.length-1;i++){


            //假设每一次循环的首值就是最小值,所以内循环的值除了首值,直接和它比就行了
            int min = i;
            for (int j=i+1;j<array01.length;j++) {
                //这里的array01[min]没有进行内循环,设的是最小值和array01[j]做比较,且array01[j]不能等于array01[i]
                //因为array01[i]这个值是每次循环的首值,已经被假设成了最小值
                if (array01[min] > array01[j]) {
                    min = j;
                }
            }


            //最小值不是首值的情况
            if (min !=i){
                //选择排序核心:将最小值存到首个位置
                //array01[min]在表达式前面表示最小值的元素引用,在后面表示一个最小值
                //array01[i]表示在表达式后面每次比较的最前面的一个值,在前面表示第一个值的元素引用
                int temp;
                temp = array01[min];
                array01[min] = array01[i];
                array01[i] = temp;
            }

        }



        for (int i =0;i< array01.length;i++){
            System.out.println(array01[i]);
        }
    }
}
