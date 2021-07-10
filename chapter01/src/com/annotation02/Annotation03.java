package com.annotation02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * 只允许该注解只可以标注类、方法
 * 希望这个注解可以被反射
 */
//只允许该注解只可以标注类、方法
@Target({ElementType.METHOD,ElementType.TYPE})
//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation03 {

    String name() default "梁朝伟";

    String[] value() default {"yh","lch"};
}
