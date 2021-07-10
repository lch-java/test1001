package com.annotation02;

/**
 * 通过反射机制获取到Annotation04中的注解
 *
 */
public class ReflectAnnotation {
    public static void main(String[] args) throws  Exception {
        Class c = Class.forName("com.annotation02.Annotation04");

        //判断Annotation04类上面是否有@Annotation03注解
        System.out.println(c.isAnnotationPresent(Annotation03.class));  //true

        if (c.isAnnotationPresent(Annotation03.class)){
            //获取该注解对象
            Annotation03 annotation03 = (Annotation03) c.getAnnotation(Annotation03.class);
            System.out.println("类上面的注解对象" + annotation03);


            //获取注解对象的属性,和调用接口一样

            String string = annotation03.name();
            System.out.println(string);
            String[] strings = annotation03.value();
            for (String s: strings
                 ) {
                System.out.println(s);
            }
        }

    }
}
