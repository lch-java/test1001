package com.exception;

/**
 * 自定义异常类
 * SUN公司写的异常类并不够用
 * 步骤:
 * ①、编写一个类继承Exception/RuntimeException
 * ②、提供两个构造方法(无参和String类型参数)
 */
public class Exception08 extends Exception{
    public Exception08() {
    }

    public Exception08(String message) {
        super(message);
    }
}
class MyException{
    public static void main(String[] args) {
        Exception08 exception08 = new Exception08("用户名不能为空");
        System.out.println( exception08.getMessage());
        exception08.printStackTrace();
    }
}

