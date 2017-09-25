package com.didala.thread;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("&&&&&&&&&&&&&");
            try {
                sleep(200L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
