package com.annotation02;

import java.lang.reflect.Field;

public class ReflectAnnotation02 {
    public static void main(String[] args)  {
        Class c = null;
        try {
            c = Class.forName("com.annotation02.Annotation06");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        if (c.isAnnotationPresent(Id.class)) {

            Field[] fields = c.getDeclaredFields();

            boolean isOk = false;

            for (Field f : fields
            ) {

                if ("id".equals(f.getName()) && "int".equals(f.getType().getSimpleName())) {

                    isOk = true;
                    System.out.println("程序正常执行");

                    break;
                }
            }

            if (!isOk) {
                throw new NotIdFindException("程序执行失败，需要一个int类型的属性id");
            }
        }


    }
}
