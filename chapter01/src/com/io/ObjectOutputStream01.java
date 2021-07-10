package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * NotSerializableException 自定义的Student类没有实现Serializable接口会出现这个异常
 *
 */
public class ObjectOutputStream01 {
    public static void main(String[] args) {
        Student s = new Student(1,"zhangsan");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("students"));
            oos.writeObject(s);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
