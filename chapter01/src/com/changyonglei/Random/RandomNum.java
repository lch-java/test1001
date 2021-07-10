package com.changyonglei.Random;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
    Random ranNum = new Random();
    int ranNum1 = ranNum.nextInt();//默认没设范围，就是int的取值范围
    //随机生成一个int范围以内的数
    //System.out.println(ranNum1);
    //随机生成一个[0,90)之间的随机数
    //nextInt表示下一个，即不能为90
    int ranNum2 = ranNum.nextInt(90);
    //System.out.println(ranNum2);


    /**
     * 小测试：将生成的五个随机数存到声明的数组中，且存的随机数不能相等
     */
    int[] ranNumber = new int[5];

    int index =0;
    while(index <ranNumber.length){
        int key = ranNum.nextInt(6);
        System.out.println("生成的随机数:" + key);
        if(!search(ranNumber,key)){
            ranNumber[index] = key;
            index++;
        }
    }

    for(int i=0;i<ranNumber.length;i++){
        System.out.println(ranNumber[i]);
    }


}

    public static boolean search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
