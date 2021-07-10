package com.changyonglei.enum01;

/**
 * 枚举
 *
 */
public class Enum01 {
    public static void main(String[] args) {
        int a = 10;
        int b= 2;
        //枚举
        System.out.println(divide(a,b) == Result.SUCCESS ? "计算成功" : "计算失败");
        //布尔
        System.out.println(divide01(a,b) == true ? "计算成功" : "计算失败");

        /*switch 支持枚举、int、String
        switch (Result.SUCCESS) {
            case SUCCESS:
                System.out.println("成功");
                break;
            case FAIL:
                System.out.println("失败");
                break;
            default:
                System.out.println("");
        }*/
    }

    public static Result divide(int a, int b) {
        try {
            int c = a/b;
            return  Result.SUCCESS;
        }catch (Exception e){
            return  Result.FAIL;
        }
    }

    public static Boolean divide01(int a, int b) {
        try {
            int c = a/b;
            return  true;
        }catch (Exception e){
            return  false;
        }
    }

}
//java.lang.enum
enum Result{
    /**
     * 枚举编译生成的也是class文件，引用数据类型
     * 一枚一枚列举出来的建议使用枚举
     * 枚举种的每一个值可以看作是常量
     * FAIL是枚举Result类的一个值
     * SUCCESS是枚举Result类的一个值
     */
    SUCCESS,FAIL

    /**
     * 枚举类型的定义，语法:enum 枚举名{枚举值1，枚举值2}
     * 结果只有两种情况的用boolean类型
     */
}
