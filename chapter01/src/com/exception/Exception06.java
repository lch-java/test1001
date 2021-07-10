package com.exception;

/**
 * finally面试题
 * 反编译代码
 *  private static int m() {
 *       int i =100;
 *       int j = i;
 *       i++;
 *       return j;
 *     }
 */
public class Exception06 {
    public static void main(String[] args) {
        System.out.println(m());   //100
    }

    private static int m() {
        int i = 100;
        try {
            return i ;
        }finally {
            i++;
        }

    }
}
