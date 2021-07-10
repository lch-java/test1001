package com.changyonglei.array.homework;

public class Test {
    public static void main(String[] args) {
        Stack s = new Stack();

        int i ;
        //i表栈帧
        for (i= s.getIndex();i<=s.getElements().length;i++){

            System.out.println(s.push(new Object()));
        }
        //System.out.println(s.push(new Object()));

        //i表示栈帧
        for (i = s.getElements().length ;i>=0;i--){

            System.out.println(s.pop());
        }




        //可以容纳任何类型的元素
//        Object[] i = {1,1.0,true,"was"};
//        for (int i1 = 0; i1 < i.length; i1++){
//            System.out.println(i[i1]);
//        }
    }

}
