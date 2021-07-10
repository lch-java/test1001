package com.changyonglei.array.homework;

/**
 * 模拟栈数据结构
 * 编写程序,使用一维数组,模拟栈数据结构
 * 第一题:
 * 编与程序,使用一维数组,模拟栈数据结构-要求:
 * 1、这个栈可以存储java中的任何引用类型的数据-
 * 2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。)
 * 3、在校中提供pop方法模拟弹校。（校空了，也有有提示信息。)
 * 4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
 * 5、假设栈的默认初始化容量是10
 */
public class Stack {
    //提供一个数组来存储栈中的数据
    private Object[] elements;
    //index表示栈帧
    private int index;

    /**
     * 在声明实例属性后直接赋值和在构造方法中赋值是一样的
     */
    //构造方法
    public Stack(){
        this.elements = new Object[10];
        this.index = 0;
    }

    //set和get方法
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    //(自己想的)
    //push方法
    /*public String push(Object[] elements) {
        for (index = 0; index<elements.length; index++){
            System.out.println("数据"+elements[index] + "压栈成功");
            System.out.println("栈帧指向" + index);
        }
        return "数据已满,压栈失败!";
    }


    //pop方法
    public String pop(Object[] elements){
        for (index= elements.length-1;index>=0;index--){
            System.out.println("数据"+elements[index] + "弹栈成功");
            System.out.println("栈帧指向" + index);
        }
        return "数据已清空,弹栈失败!";
    }*/


    //(正确写法)
    //push方法
    public Object push(Object obj){
        if (index>=elements.length){
            return "数据已满,压栈失败!";
        }

        index++;
        //index-1不能为10
        elements[index-1] = obj;  //将新创建的对象存进数组元素中
        return "数据" + obj + "压栈成功," + " 栈帧指向:" + index;
    }

    //pop方法
   public Object pop(){

        if (index<=0){
            return "数据已清空,弹栈失败!";
        }
       System.out.println("数据" + elements[index-1] + "弹栈成功,");
        //index01表示下标
        int index01 = --index;
        //栈帧指向的是下标
        return  " 栈帧指向:" + index01;
   }

}
