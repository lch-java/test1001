package com.annotation02;

import static com.annotation02.Season.*;

public class Annotation02 {

    //若注解有属性，必须给属性赋值，但若是在注解中的属性给出了默认值，就不用在标注的时候写了
    //@Annotation(属性名=属性值,属性名=属性值)
    //如果一个注解的属性的名字是value，那么在用该注解时(前提这个注解只给该value赋值)，后面括号中的value可以省略,直接

    //若数组中只写一个元素时，此时大括号可以省略
    @Annotation(value1 = "zhangsan",stringValue = "3519452660@qq.com", value = SPRING)
    public void doSome(){

    }

    @Annotation(value1 = "zhangsan",stringValue = {"3519452660@qq.com","3519452660@163.com"},
    value = {Season.SPRING,Season.SUMMER,AUTUMN,WINTER})
    public void doOther(){

    }
}
