package com.changyonglei.array.homework;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎使用酒店管理系统,输入[1]订房,输入[2]退房,输入[3]查看所有房间的信息,输入[4]退出系统");
        while (true) {
            System.out.print("请输入功能编号:");
            int num = s.nextInt();

            if (num == 1) {
                System.out.print("请输入房间号:");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
                System.out.println(roomNo + "已订房");
            } else if (num == 2) {
                System.out.print("请输入房间号:");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
                System.out.println(roomNo + "已退房");
            } else if (num == 3) {
                hotel.print();
            } else if (num == 4) {
                System.out.println("系统已退出,欢迎下次使用");
                return;
            } else {
                System.out.println("出错了!");
            }
        }




    }
}
