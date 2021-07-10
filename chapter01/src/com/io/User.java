package com.io;

import java.io.Serializable;

public class User implements Serializable {

    //手动编写序列化版本号(idea自动生成)
    private static final long serialVersionUID = -937562532130655833L;




    private int no;
    private String name;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}



