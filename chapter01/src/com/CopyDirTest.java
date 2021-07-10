package com;

/**
 * 用到了String的方法
 * boolean endsWith(String s)   判断是否是以该字符串结尾的
 * String subString(int beginIndex) 从该字符串对象的第beginIndex个下标开始生成一个新字符串，此下标的字符也算到里面
 */

import java.io.*;

/**
 * 目录拷贝测试
 */
public class CopyDirTest {
    public static void main(String[] args) {

        File file01 = new File("D:\\Desktop\\学校作业");

        File file02 = new File("D:\\");

        copyDir(file01,file02);



    }


    /**
     * 目录拷贝copyDir()方法
     * @param file01    起始目录
     * @param file02    要传入的目录
     */
    private static void copyDir(File file01,File file02) {

        if (file01.isFile()){
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file01);
                String path = (file02.getAbsolutePath().endsWith("\\") ? file02.getAbsolutePath()
                         : file02.getAbsolutePath() + "\\" )+
                        file01.getAbsolutePath().substring(11) ;
                fos = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = fis.read(bytes)) != -1){
                    fos.write(bytes,0,readCount);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        File[] files = file01.listFiles();

        for (File f : files
             ) {
            //获取所有的子目录(包括目录和文件)
            //System.out.println(f.getAbsolutePath());

            if (f.isDirectory()){
                /**
                 * 若是目录，就需要拷贝目录
                 * 若是文件，就只需读写
                 * 所以这里需要做一个if判断
                 */
                String strDir = f.getAbsolutePath();
                String destDir = (file02.getAbsolutePath().endsWith("\\") ? file02.getAbsolutePath()+
                        strDir.substring(11) : file02.getAbsolutePath() + "\\" + strDir.substring(11) );
                //在指定位置生成一个目录
                File file = new File(destDir);
                if (!file.exists()){
                    file.mkdirs();
                }
            }

            copyDir(f,file02);
        }
    }
}
