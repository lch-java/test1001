package com.changyonglei.array;

public class Array03 {
    public static void main(String[] args) {
        String[] arr = {"yh","lch","www"};
        printArray03(arr);
        System.out.println(arr);
        System.out.println("------------------------------------------");


        //动态初始化数组赋值的两种方式
        //①、声明引用再赋值
        String arr01[] = new String[5];
        printArray03(arr01);
       //②、直接创建数组对象
        printArray03(new String[5]);

        //静态初始化数组赋值的两中方式
        //①、
        String[] arr02 = {"yh","lch","www"};
        printArray03(arr02);

        //②、
        printArray03(new String[]{"I","  love","  you"});
        System.out.println(new String[]{"1","e"});
    }

    public static void printArray03(String[] args){
        for (int i=0;i< args.length;i++){
            System.out.print(args[i]);
        }
        System.out.println("\n");
        System.out.println(args);
    }
}
