package com.changyonglei.array;

/**
 * java语言中的数组是一种引用数据类型，父类也是Object
 * 数组是一个容器，可以同时容纳多个元素.(一组数据，一个数据的集合)，本质是一个数据结构
 * 数组可以存储基本数据类型和引用数据类型的数据
 * 数组中存储的基本数据类型都是字面值，存储的引用数据类型都是该引用数据类型的对象内存地址
 * 因为数组是引用数据类型，所以数组的对象存储在堆内存当中
 * java中，数组一旦创建，长度不可变
 * 数组若存的是"Java对象"，实际存储的是对应的内存地址
 * 数组的分类：一维数组、二维数组、三维数组、多维........
 * 所有的数组对象都有length(Java自带的)属性，length的作用：获取数组中元素的个数,即数组的长度
 * Java中的数组要求数组元素的统一，不能混合存储，要么都是某一基本数据类型，要么都是某一引用数据类型
 * 数组在内存方面存储时，数组中的元素内存地址都是连续的
 * 数组是一种简单的数据结构，实际地址的连续性。例如B+Tree是索引的底层数据结构，底层索引会对数据进行排序、分区一样
 * 所有的数组都是以第一个元素的实际地址来作为整个数组对象的内存地址
 * 分清数组对象的内存地址和元素的实际内存地址
 * 数组中的每个元素都是有下标的，且从第一个元素(下标为0)开始，以一递增，最后一个元素的下标是length-1
 * length：数组的长度(数组元素的个数)
 * 在我们对数组中元素进行"存取"时，会用到下标
 * int[] i = 0x11;含义：int[]整体是一个数组，int表示这个数组里存储的元素都是int类型，0x11是这个数组对象的内存地址
 * 引用i中存储的是数组对象的内存地址
 *
 * 面试数组为什么检索效率高？(查询效率最高的一种数据结构)
 * ①、数组第一个元素的内存地址已知，且数组中元素之间的内存地址是连续的
 * ②、已知数组每个元素的下标，数组中每个元素占用的空间都是相同的
 * ③、这些条件可以形成一个数学表达式，直接定位到每个元素所对应的实际内存地址
 *
 * 数组的缺点：
 * ①、为了保证数组元素内存地址的连续性，在对数组的元素进行增删时，要让数组中大量相关的元素进行向前或者是向后位移，很不方便
 * 注意：数组中最后一个元素的增删不会影响效率
 * ②、数组在内存中很难(找到大块)的连续性的内存空间,因为内存中存储的对象都是没有规律的，所以数组在划分元素的内存地址时，中间元素
 * 的内存地址可能会被别的对象占用。不能存储大数据量
 *
 * 一维数组的声明：
 * 语法格式：int[] array01;
 * 语法格式：int[] array02;
 * 初始化一个一维数组：
 * 语法格式：①、静态初始化：
 *                  int[] array01 = {1,55,76,23};
 *         ②、动态初始化：
 *                  int[] array01 = new int[5];初始化一个5个长度的int类型数组，每个元素的默认值为0
 *                  5表示数组元素的个数，并且数组中每个元素的默认值为0
 *                  String[] array01 = new[6];初始化一个6个长度的String类型的数组，且每个元素默认值为null
 *
 *
 *
 */
public class Array01 {
    public static void main(String[] args) {
        int[] array01 = {2, 324, 45, 62, 234, 35, 253}; //int[]构成一个类型，Java写法
        //int array01[] = {2, 324, 45, 62, 234, 35, 253}; //c++写法
        //所有数组对象都有一个length属性：输出数组对象中有多少个元素
        System.out.println("array01数组的元素个数：" + array01.length + "个");
        System.out.println(array01);    //数组对象的内存地址

        //下标的作用：对数组中的元素进存取
        //读数：中括号里面的数据是数组对象中元素对应的下标值
        System.out.println("第二个元素值：" + array01[1]);
        System.out.println("最后一个元素值：" + array01[array01.length - 1 ]);
        System.out.println("倒数第二个元素值：" + array01[array01.length - 2 ]);

        //存
        array01[0] = 2141; // 将第一个元素字面值改成2141
        array01[5] = 456; // 将第6个元素字面值改成456
        System.out.println("第一个元素修改后的字面值：" + array01[0]);
        System.out.println("第6个元素修改后的字面值：" + array01[5]);

        //一维数组的遍历(顺序)
        for (int i=0;i< array01.length;i++) {
            System.out.println(array01[i]);     /*这里的i是下标的表示，i不能等于数组对象的长度，否则在用下标读取值时会出现
            数组下标越界异常*/
        }
        //一维数组的遍历(倒序)
        for (int i =(array01.length -1);i>=0;i--){
            System.out.println(array01[i]);

        }




    }
}
