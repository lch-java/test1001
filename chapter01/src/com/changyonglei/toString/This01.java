package com.changyonglei.toString;

public class This01 {
    /**
     匿名内部类可以替代实现类,但不建议使用内部类
     可读性差，且只能使用一次

     */


        public static void main(String[] args){

            People p = new People();
            //通过实现类执行的
            p.sum(new Comp(),200,200);
            //通过匿名内部类执行的
		    /*p.sum(new Compute(){
			public int sum(int a,int b){
				return a + b;
			}
		},100,200);*/
        }
    }


    interface Compute{
        int sum(int a,int b);
    }

    //实现类
    class Comp implements Compute{
        public int sum(int a,int b){
            return a + b;
        }
    }

    class People {
        public void sum(Compute c, int a, int b) {
            System.out.println(a + "+" + b + "=" + c.sum(a, b));
        }
    }
