package com.changyonglei.number;

import java.text.DecimalFormat;

public class DecimalFormat01 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        String str01 = df1.format(12123.431);
        System.out.println(str01);

        Number dou1 = df1.parse("123");
        System.out.println(dou1);

    }
}
