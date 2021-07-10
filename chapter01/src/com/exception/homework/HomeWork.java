package com.exception.homework;

import java.util.Scanner;

/**
 * 异常作业
 * 编写程序模拟用户注册：
 * 1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
 * 2、输入信息之后，后台java程序模拟用户注册。
 * 3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
 */
public class HomeWork {
    public static void main(String[] args) {
        RegisterSystem rs = new RegisterSystem();
        while (true) {
            System.out.print("用户名:");
            System.out.println("\n");
            System.out.print("密码:");
            Scanner s = new Scanner(System.in);
            String username = s.next();
            String password = s.next();

            try {
                rs.register(username, password);

            } catch (UsernameFormatException ufe) {
                ufe.printStackTrace();
            }finally {
                System.out.println("输入0重新注册");
                System.out.println("输入1退出系统");
                int i = s.nextInt();
                if(i ==1){
                System.exit(0);
                }
            }

        }
    }

}
