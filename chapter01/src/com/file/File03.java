package com.file;

import java.io.File;

/**
 * File中的方法 03
 * 获取该目录下的所有子文件
 * File[] listFiles()
 */
public class File03 {
    public static void main(String[] args) {
        File f = new File("D:\\Desktop\\集合");
        File[] files = f.listFiles();
        for (File file: files
             ) {
            System.out.println(file.getAbsoluteFile());
        }
    }
}
