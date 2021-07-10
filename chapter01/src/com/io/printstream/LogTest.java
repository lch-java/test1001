package com.io.printstream;

import java.io.FileNotFoundException;

/**
 * 日志测试类
 */
public class LogTest {
    public static void main(String[] args) {
        try {
            Logger.log ("我刚吃完饭");
            Logger.log("我正在学习java编程");
            Logger.log("我已经学到了File章节");
            Logger.log("我想玩王者荣耀，但是我不得不把今天的课程先学完");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
