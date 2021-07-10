package com.changyonglei.array;

/**
 * 关于一维数组的扩容
 * 数组的长度是固定不变的，所以可以通过创建一个大容量数组对小容量数组的数据进行拷贝，
 * 数组扩容效率较低，所以应尽避免数组的扩容
 * 数组的拷贝可以通过System.arraycopy(五个实参)来进行拷贝、扩容
 */
public class Array06 {
    public static void main(String[] args) {
        /*类库中java.util.lang.System类源代码：public static native void arraycopy(Object src,  int  srcPos,
        Object dest, int destPos,
        int length);*/  //源数组,源数组的下标起点,目标数组,目标数组的下标起点,拷贝多长
        //Object是数组的父类,所以Object类的引用也可以指向数组对象
        //System.arraycopy(五个实参);

        //直接传递一个静态数组的写法
        System.out.println(new int[]{1,3,6,8});//输出的是数组对象的地址
        System.out.println();
        //直接传递一个动态数组的写法
        System.out.println(new int[4]);//输出的是数组对象地址


        // 数组的扩容
        int[] i = {1,45,67,79};     //源数组
        int[] j = new int[9];       //目标数组
        System.arraycopy(i,0,j,0,i.length);
        //srcPos:源数组起始下标,destPos:目标数组的起始下标,length:拷贝长度,不能超源数组的长度
        for (int i01 = 0; i01 < j.length; i01++){
            System.out.println(j[i01]);

        }


    }

}
