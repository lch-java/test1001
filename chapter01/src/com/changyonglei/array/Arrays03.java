package com.changyonglei.array;

/**
 * 不用二分法,通过遍历来找某个数组中元素所对应的下标
 * 进行判断的时候可以用三目运算符:布尔表达式	  ? 	表达式1 : 表达式2 ;
 */
public class Arrays03 {
    public static void main(String[] args) {
        int[] arr = {1,3,3,12,54};
        Arrays03  a = new Arrays03();
        System.out.println(a.print(arr,3));

    }

    /**
     *
     * @param arr 表示被检索的一维数组
     * @param ints  表示被检索的元素
     * @return  返回的是被检索的数组元素所对应的下标
     */
    public String print(int[] arr,int ints){
        for (int i=0;i< arr.length;i++){
            if (arr[i] == ints){
                return  ints + "对应的下标是:" + i;
            }

        }

        return  "没有" + ints + "这个元素";

    }
}
