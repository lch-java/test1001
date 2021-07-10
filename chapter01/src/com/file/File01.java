package com.file;

import java.io.File;
import java.io.IOException;

/**
 * File与io流无关，是文件或路径名的一种抽象的表示形式
 * File可以是文件，也可以是路径名
 * File常用方法 01
 */
public class File01 {
    public static void main(String[] args) {
        File f = new File("D:/desktop/javaweb/file01");

        //判断该file在指定位置是否存在

        boolean b = f.exists();
        System.out.println(b);
        //如果不存在，用文件的形式创建出来
        if (!b){
            //以文件的形式创建出来
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //如果不存在，以目录的形式创建出来
//        if (!b){
//            f.mkdir();
//        }

        //以多重目录的形式创建出来
//        if (!b){
//            f.mkdirs();
//       }

        //获取父目录
        String s = f.getParent();
        File parentFile = f.getParentFile();
        System.out.println(parentFile);

        //获取绝对路径
        String s1 = f.getAbsolutePath();
    }
}
