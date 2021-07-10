package com.exception;

/**
 * 模拟栈(改良版)
 */
public class MyStack {
    private Object[] arr = new Object[10];
    private int index;

    //setter和getter方法
    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public MyStack() {
    }

    public MyStack(int index) {
        this.index = index;
    }

    //压栈
    public void push(Object obj) throws Exception08{
        if (index>=arr.length-1){
            throw new Exception08("栈已满，压栈失败");
        }
        arr[++index] = obj;
        System.out.println(arr[index] + "压栈成功,此时栈帧指向:" + index);
    }

    //弹栈
    public void pop() throws Exception08{
        if (index <0){
            throw new Exception08("栈已空，弹栈失败");
        }
        System.out.println(arr[index--] + "弹栈成功" + "此时栈帧指向:" + index);

        //System.out.println("此时栈帧指向:" + index);
    }
}
