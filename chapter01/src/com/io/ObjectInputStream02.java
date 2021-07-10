package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化一个集合
 */
public class ObjectInputStream02 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {

            ois = new ObjectInputStream(new FileInputStream("users"));
            //反序列化一个集合
            List<User> list = (List<User>) ois.readObject();
            for (User userList: list
                 ) {
                System.out.println(userList);
            }

            /*Object obj = ois.readObject();
            System.out.println(obj);*/
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
