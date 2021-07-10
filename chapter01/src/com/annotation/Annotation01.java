package com.annotation;

import javax.xml.ws.soap.Addressing;

/**
 * 注解又被称为注释类型，不是当前的这种注释，英文是Annotation
 * 注解是一种引用数据类型，编译后生成class文件
 * 自定义注解，语法机制:
 * 修饰符列表 @interface 注解类型名{}
 *
 * 注解的
 * @注解类型名使用时语法格式:
 * 注解可以出现在类上、属性上、方法上、变量上等...
 * 注解还可以出现在注解类型上
 *
 */
@MyAnnotation
public class Annotation01 {
    @MyAnnotation
    int no;

    @MyAnnotation
    public Annotation01(){}

    @MyAnnotation
    public static void doSome(){
        @MyAnnotation
        int i = 0;
    }

    @MyAnnotation
    public void doOther(){}

    public static void main(String[] args) {

    }

}

@MyAnnotation
interface MyInterface{}

@MyAnnotation
enum MyEnum{
    SPRING,SUMMER,AUTUMN,WINTER
}

@MyAnnotation
@interface OtherAnnotation{}    //注解出现在其他注解上
