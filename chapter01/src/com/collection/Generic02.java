package com.collection;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDK8后：自动类型推断机制(钻石表达式)
 */

public class Generic02 {
    public static void main(String[] args) {
        //钻石表达式，后面的泛型无需写
        List<Animal> arr = new ArrayList<>();
        arr.add(new Cat());
        arr.add(new Bird());

        //遍历
        Iterator<Animal> it = arr.iterator();
        while (it.hasNext()){
            Animal ani = it.next();
            ani.move();
        }

        List<String> str = new ArrayList<>();
        str.add("https://www.bilibili.com/video/BV1Rx411876f?p=690&spm_id_from=pageDriver");

        Iterator<String> string = str.iterator();
        while (string.hasNext()){
            String str01 = string.next();
            System.out.println(str01);
        }
    }
}

