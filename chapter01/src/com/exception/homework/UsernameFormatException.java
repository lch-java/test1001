package com.exception.homework;
/**
 * 异常作业
 * 编写程序模拟用户注册：
 * 1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
 * 2、输入信息之后，后台java程序模拟用户注册。
 * 3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
 */
public class UsernameFormatException extends Exception {
    public UsernameFormatException() {
    }

    public UsernameFormatException(String message) {
        super(message);
    }
}
