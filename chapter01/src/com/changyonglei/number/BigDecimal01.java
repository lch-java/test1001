package com.changyonglei.number;

/**
 * 财务用的程序就是通过BigDecimal类来编写的，精度很大
 *
 */
import java.math.BigDecimal;
public class BigDecimal01 {
    public static void main(String[] args) {
        //这个2精度极高
        BigDecimal bd = new BigDecimal(2);
        BigDecimal bd1 = new BigDecimal(0.1);
        //不能直接四则运算
        System.out.println(bd.add(bd1));//2.1000000000000000055511151231257827021181583404541015625
    }
}
