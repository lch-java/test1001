package com.map;

import java.util.TreeSet;

/**
 * TreeMap/TreeSet集合的排序
 * 无序不可重，且自动排序，无下标
 * 自定义类当成泛型作为TreeSet集合中的元素类型时，需要在自定义类中实现Comparable接口，并重写toCompare方法(不用重写equals方法)
 * 这种适用于new无参的TreeSet对象
 */
public class TreeMap01 {
    public static void main(String[] args) {
        //钻石表达式
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student(16);
        Student s2 = new Student(15);
        Student s3 = new Student(17);

        //往TreeSet集合中添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student s : ts
             ) {
            System.out.println(s);
        }
    }
}



class Student implements Comparable<Student>{
    int age;

    public Student(int age) {
        this.age = age;
    }

    /**
     *
     * @param o 学生对象参数
     * @return  通过比较当前学生对象和传进来的学生对象的年龄进行排序
     */
    @Override
    public int compareTo(Student o) {
        //主要是这一步需要程序员自定义，通过什么来比较进行排序
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}