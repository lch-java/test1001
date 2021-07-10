package com.exception;

/**
 * finally可以直接和try连用
 * 且try中就算由return；来结束方法，finally也会执行再执行return
 * 但try中的return不能写在Java语句上面
 * 执行顺序:①、try②、finally③、try中的return
 * try和finally都不能单独使用
 */
public class Exception05 {
    public static void main(String[] args) {
        /*try{
            System.out.println("begin");
            System.exit(0); //退出virtual machine JVM可以不让finally执行
            return;

        }finally {
            System.out.println("over");
        }*/
        //值new了异常对象，没有抛出


    }
}
