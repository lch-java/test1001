package com.changyonglei.String;

/**
 * String类中常用的方法
 *
 */
public class String04 {


    public static void main(String[] args) {
        //①.char charAt(int index)
        //作用:返回指定索引/下标处的 char 值。
        char c = "中国人".charAt(1);
        System.out.println(c); //国


        //②.int compareTo(String anotherString)-----了解
        //作用:比较字符串之间的大小,相比equals方法它可以看出谁大谁小,不能用<>号去比较字符串的大小
        //按字典顺序比较两个字符串,从每个字符串的首字母开始对比,若是一样,再进行后面字母的比较,若是不一样就分出大小了
        int result = "abc".compareTo("abc");
        System.out.println(result);     //0,表示前后一致
        int result1 = "abcd".compareTo("abce");
        System.out.println(result1);    //-1,表示前小后大
        int result2 = "abce".compareTo("abcd");
        System.out.println(result2);    //1,表示前大后小


        //③.boolean contains(CharSequence s)  sequence中文意思:一系列、顺序、次序
        //作用:判断前面的字符串是否包含后面的子字符串
        System.out.println("我很钟意你啊".contains("钟意")); //true


        //④.boolean endsWith(String suffix)  suffix意思后缀
        //判断当前子字符串是否以某个字符串结尾
        System.out.println("我很钟意你啊".endsWith("啊")); //true
        System.out.println("我很钟意你啊".endsWith("你")); //false

        //⑤.boolean equals(Object anObject)
        //判断两个字符串是否相等,使用equals方法,只能判断是否相等,不能比较大小
        System.out.println("abc".equals("abc")); //true

        //⑥.boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等,并忽视字符串的大小写
        System.out.println("aBc".equalsIgnoreCase("ABC")); //true

        //⑦、byte[] getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();     //a对应97，b对应98，依此类推
        for (int i=0;i< bytes.length;i++){
            System.out.println(bytes[i]);   //97、98、99、100、101、102
        }

        //⑧、int indexOf(String str)
        //判断某个子字符串在当前字符串当中的第一次出现处的下标/索引
        //前面是当前字符串，后面是子字符串
        System.out.println("abcdadejavawakldk.cccjavawads".indexOf("java"));    //7
        System.out.println("abcdadejavawakldk.cccjavawads".indexOf("javac"));    //-1 表示找不到

        //⑨、boolean isEmpty()
        //判断某个字符串是否为空字符串，不是null，否则会出现空指针异常
        String s = new String();
        String s1 = "";
        System.out.println(s.isEmpty());    //true
        System.out.println(s1.isEmpty());    //true

        //⑩、int length()
        //面试题,
        // length方法也可以判断字符串对象是否为空字符串
        //判断数组的长度用length属性，判断字符串的长度用length()方法
        System.out.println("abcdefg".length()); //7

        //⑩①、int lastIndexOf(String str)
        //判断某个子字符串在当前字符串当中的最后一次出现处的下标/索引
        //前面是当前字符串，后面是子字符串
        System.out.println("abcdadejavawakldk.cccjavawads".lastIndexOf("java"));    //21
        System.out.println("abcdadejavawakldk.cccjavawads".lastIndexOf("javac"));    //-1 表示找不到


        //⑩②、String replace(CharSequence target,CharSequence replacement)      target表示目标、靶子的意思
        //String的父接口是CharSequence
        //将元字符串中的一段换成别的字符串
        System.out.println("http://www.baidu.com".replace("http:","https:"));//https://www.baidu.com


        //⑩③、String[] split(String regex)------>重点
        //regex 的意思是正则表达式 ，split表分割，这里是分割方法，spilt是spill的过去式和过去分词，表溢出、涌出
        System.out.println("2017-07-01".split("-"));//返回的是一个String数组的内存地址

        //通过"-"对原字符串进行拆分
        String[] s2 = "2017-07-01".split("-");

        for (int i =0;i< s2.length;i++){
            System.out.println(s2[i]); //String数组的s2遍历 2017、07、01
        }

        //⑩④、 boolean startsWith(String prefix)    prefix表前缀，suffix表后缀
        //判断原字符串是否以子字符串开始
        System.out.println("atm".startsWith("a"));  //true
        System.out.println("atm".startsWith("m"));  //false

        //⑩⑤、  String substring(int beginIndex)
        //截取字符串,参数是起始下标,起始下标对应的字符会输出
        System.out.println("http://www.baidu.com".substring(7));  //www.baidu.com

        //⑩⑥、String substring(int beginIndex, int endIndex)
        //截取字符串，参数是起始下标和结束下标，起始下标对应的字符会输出，但结束下标对应的字符不会输出
        //[beginIndex,endIndex),左闭右开
        System.out.println("http://www.baidu.com".substring(0,10)); //www

        //⑩⑦、char[] toCharArray()
        //将字符串转换成char字符串组
        char[] chars = "我是中国人".toCharArray();
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);//我 是 中 国 人
        }


        //⑩⑧、String toLowerCase()
        //转换成小写
        System.out.println("AbDc".toLowerCase());   //abdc

        //String toUpperCase()
        //转换成大写
        System.out.println("AbDc".toUpperCase());   //ABDC

        //⑩⑨、toString()方法,返回对象本身，它已经是一个字符串
        String[] strings = {"我是","中国人"};
        System.out.println(strings[0].toString());

        //②〇、String trim()
        //去除字符串前后空白,中间的空白不会去
        System.out.println("      Hello  World    ".trim());

        //②①、String中只有这一个valueOf()方法是静态的
        //valueOf()是静态方法,作用：将"非字符串"转换成"字符串"
        System.out.println(String.valueOf(1));  //1,将1转换成字符串再进行输出
        Customer c1 = new Customer();
        System.out.println(String.valueOf(c1));     //底层调用了toSting方法，将这个内存地址转换成了一个字符串再进行输出的
        System.out.println(c1.toString());     //和上面那个表达式一样，println底层会自动调用valueOf方法


        //总结：之所以println去输出引用时会调用toString方法，是因为println底层调用了String.valueOf()方法，将其转换成
        //字符串之后，valueOf方法底层又调用了toString方法，一环套一环，而toString方法默认输出的就是一个十六进制的
        //内存地址。只要在控制台上输出的都是字符串



    }
}

class Customer{
   /* @Override
    public String toString() {
        return "Customer{}";
    }*/
}
