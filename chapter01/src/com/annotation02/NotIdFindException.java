package com.annotation02;

public class NotIdFindException extends RuntimeException{
    /**
     * 自定义异常的方式
     * 写上无参构造和有参构造
     */

    public NotIdFindException() {
    }

    public NotIdFindException(String message) {
        super(message);
    }
}
