package com.annotation;

/**
 * 关于JDK lang包下的@deprecated注解
 * 作用:标注在元素上时，在别的类调用该方法时会出现已过时的标记
 * 这个注解被保存到class文件上，并且可以被反射机制读取
 * LOCAL_VARIABLE 局部变量
 */
public class Annotation03 {
    @Deprecated
    public static void doSome(){}

    @Deprecated
    public  void doOther(){}
}

class Test{
    public static void main(String[] args) {
        Annotation03 test = new Annotation03();

        test.doOther();

        Annotation03.doSome();
    }
}
