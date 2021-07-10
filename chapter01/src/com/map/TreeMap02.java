package com.map;

public class TreeMap02 {
    public static void main(String[] args) {

    }
}

class Vip implements Comparable<Vip>{
    int age;
    String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Vip vip) {
        if (this.age == vip.age){
            //这里调用的是string中的compareTo方法
          return this.name.compareTo(vip.name);
        }else{
        return this.age - vip.age;
        }
    }
}
