package com.collection;

/**
 * 自定义泛型，<>中是一个标识符，一般写成T/E，可以随便写
 * E是element
 * T是Type
 *
 * @param <T>在创建该类对象的时候，若是没有写泛型，则默认该标识符指的是Object类型
 *           写了泛型这个T就是什么类型标识符
 */
public class Generic03<T> {
    public static void main(String[] args) {
        //写了泛型
        Generic03<String> gr = new Generic03<>();
        gr.doSome("123");//只能传字符串
        //没写泛型
        Generic03 gr01 = new Generic03();
        gr01.doSome(new Object());//只能是Object类型
    }

    public void doSome(T t){
        System.out.println(t);
    }
}
