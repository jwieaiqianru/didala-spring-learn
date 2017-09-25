package com.didala.thread;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class TestTread2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Thread t1 = new Consumer(myStack);
       Thread t2= new Producer(myStack);
        t1.start();
        t2.start();
    }
}
