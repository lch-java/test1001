package com.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream是一个数据字节输出流
 * 这个流将数据和数据类型一并写入文件中(该文件不能用记事本打开，不是普通文本文档)
 * 构造方法要求传OutputStream类型的实参
 */
public class DataOutputStream01 {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("D:/desktop/temp"));
            short sho = 3;
            long l = 2L;
            float f = 2.1F;
            int i =312;
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeInt(i);
            dos.writeShort(sho);

            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
