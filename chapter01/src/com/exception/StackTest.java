package com.exception;

public class StackTest {
    public static void main(String[] args) {

        MyStack myStack = new MyStack(-1);
        for (int i=0;i<= myStack.getArr().length;i++) {
            try {
                myStack.push(new Method());
            } catch (Exception08 e8) {
                e8.printStackTrace();
            }
        }
        for (int i = 0; i<= myStack.getArr().length; i++) {
            try {
                myStack.pop();
            } catch (Exception08 e8) {
                e8.printStackTrace();
            }
        }
    }
}

class Method{}