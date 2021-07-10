package com.annotation;

/**
 * 关于JDK lang包下的override注解
 * 源代码:public @interface Override{}，override注解,被称为标识性注解，因为它的类体中没有任何Java语句
 * 这个注解只能注解方法
 * 这个注解只是给编译器参考的，和运行期没有关系
 * 这个注解就是给编译器进行编译检查的，若是不是重写父类的方法，就会报错
 * 非必须的，这个注解不写也没事
 * 元注解
 * 用来标注注解的注解称为元注解
 *
 * 常见的元注解: Target、Retention,有5个，这里只学两个
 * lang包下的:override、Deprecated
 * Target
 * @Target(ElementType.METHOD)  标注了Override注解，指定Override注解能够出现在什么位置(METHOD)上，作用:
 * 被它修饰的注解只能修饰指定的位置上的数据
 * @Retention(RetentionPolicy.SOURCE) (SOURCE表示被注解的Override只被保留在java源文件中)，作用:
 * 被它修饰的注解只能保存到Java源文件中
 *
 * 被保留在java源文件中的意思:
 * 这里的@Override只在Java文件中有，在class文件中没有
 * public @interface Override {
 * }
 * @Retention(RetentionPolicy.CLASS) 表示被注解的注解被保留在class文件中
 * @Retention(RetentionPolicy.RUNTIME)  表示被注解的注解保存在class文件中，并且可以被反射机制读取
 */
public class Annotation02 {
    int i ;
                //被保留在java源文件中的意思:
    @Override   //这里的@Override只在Java文件中有，在class文件中没有
    public String toString() {
        return "Annotation02{" +
                "i=" + i +
                '}';
    }
}
