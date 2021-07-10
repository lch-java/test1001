package com.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 序列化集合
 */
public class ObjectOutputStream02 {
    public static void main(String[] args) {
        List<User> userList  = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));
        ObjectOutputStream oos = null;
        try {

            oos = new ObjectOutputStream(new FileOutputStream("users"));
            //一次序列化一个集合，因为ArrayList集合和它的元素User类型已经实现serializable,所以不会报错
            oos.writeObject(userList);


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
