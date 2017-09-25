package com.didala.thread;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class TestThread {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread1();
        Thread myThread2 = new MyThread2();
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        myThread1.start();
        //myThread2.start();
        thread.start();
    }
}
