package com.annotation02;

public @interface Annotation {
    /**
     * 在注解中可以自定义属性
     * 以下代码看着像一个方法，实则是注解里的一个属性
     * 注解中的属性类型只能是八种基本数据类型、String、枚举类型、Class以及它们对应的数组
     * @return
     */

    String[] stringValue() ;
    String value1();

    String color() default "";

    int age() default 24;

    Season[] value();
}


enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}



