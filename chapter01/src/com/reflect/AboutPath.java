package com.reflect;

/**
 * 研究文件的路径
 * 因为在涉及到文件路径时，在idea中用的相对路径默认是project中，若是用别的工具打开，就会找不到
 * 对应的路径文件，移植性差
 *
 * JDK中有三种类加载器:启动类加载器、应用类加载器、扩展类加载器
 */
public class AboutPath {
    public static void main(String[] args) {
        //以下方式的前提是该文件必须要在类路径下，即src下的都是类路径下的，src是类的根路径
        /**
         * getContextClassLoader()是线程对象中的方法
         * Thread.currentThread().getContextClassLoader()表示拿到一个当前线程的类加载器对象
         * getResource()是类加载器中的方法，当前线程的类加载器对象从类的根路径下获取资源
         * 以后用IO流时都可以使用这种方式来写路径
         */
        //拿到的是文件的绝对路径(这种方式适合各种操作系统，例如Linux系统，若是直接写绝对路径Linux系统不支持)
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo02.properties").getPath();

        System.out.println(path);

        String path1 = Thread.currentThread().getContextClassLoader()
                .getResource("com/bean/User.class").getPath();

        System.out.println(path1);
    }

}
