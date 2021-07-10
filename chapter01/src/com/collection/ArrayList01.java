package com.collection;

import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        //ArrayList集合默认初始化容量是10，底层是Object数组
        ArrayList al = new ArrayList();
        //可以指定长度
        ArrayList ali = new ArrayList(19);


        /**
         * 将Set类集合转成List集合
         */
        Collection c = new HashSet();
        Collection c1 = new TreeSet();
        //HashSet集合转成ArrayList
        ArrayList a = new ArrayList(c);
        //TreeSet集合转成ArrayLIst
        ArrayList a1 = new ArrayList(c1);

    }
}
