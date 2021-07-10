package com.changyonglei.array;

/**
 * main方法中的String数组
 */
public class Array04 {
    public static void main(String[] args) {
        Object[] obj = {1,"s",new Array04()};
        for (int i=0;i<obj.length;i++) {
            System.out.println(obj[i]);
        }
        //空指针异常
        //args = null;
        System.out.println("main方法中的String数组的长度：" + args.length);
        //输出该数组的长度默认为0，在运行时加上几个元素的数据，这个数组就会有多长
        for (int i =0;i< args.length;i++){
            System.out.println(args[i]);

        }
        System.out.println(args);
        //若是args为null会出现空指针异常
        //length属性属于实例属性，需要对象参与，而数组算是一个引用数据类型，所以args就是数组对象的引用

        /*这个数组里什么时候会有值？
        作用：接收用户输入参数时这个String[]数组的长度就会有变化，并且输入的参数就是String数组中 存储的值
        在控制台输入java Array04 a b c (a b c会被jvm通过空格的形式进行分离，完成后装到String[] args数组中充当元素数据)
        在idea中最上面一排的Run中，找到Edit Con......,进去操作在program arguments中手动添加String类型的存储数据，
        并且两种方式都不用加上双引号

        */

    }
}
