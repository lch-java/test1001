package com.service;

import java.io.Serializable;

public class Test {
    public static void main(String[] args) throws  Exception{
        Class su = Class.forName("com.service.ServiceUser");

        System.out.println(su.newInstance());


    }
}
