package com.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * DataInputStream数据字节输入流
 * 通过数据字节输出流写的文件只能通过该流打开，否则出现乱码
 * 且在读的时候要知道写的顺序
 * 参数只能是InputStream类型的实参
 */
public class DataInputStream01 {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("D:/desktop/temp"));
            long l = dis.readLong();
            float f = dis.readFloat();
            int i = dis.readInt();
            short sho = dis.readShort();

            System.out.println(l);
            System.out.println(f);
            System.out.println(i);
            System.out.println(sho);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
