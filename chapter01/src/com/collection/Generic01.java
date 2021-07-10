package com.collection;
/**
 * 泛型是用来指定集合中存储的数据类型
 * 编译期的一个特性
 * 集合中存储的元素类型统一
 * 导致集合中存储的元素缺乏多样性
 *  大多数业务中，集合存储的元素都是统一的，所以泛型被认同了
 *  作用:使用一个类的方法时在使用迭代器，在while循环里面无需转型
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic01 {
    public static void main(String[] args) {
        List<Animal> arr = new ArrayList<Animal>();
        Cat tom = new Cat();
        Bird bird = new Bird();


        arr.add(tom);
        arr.add(bird);

        Iterator<Animal> it = arr.iterator();
        while (it.hasNext()){
           Animal animal = it.next();
           animal.move();

        }
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("小猫走猫步");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("小鸟在飞翔");
    }
}
