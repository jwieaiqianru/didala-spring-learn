package com.didala.thread;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class Consumer   extends  Thread {
    private final MyStack ms;

    public Consumer(MyStack ms) {
        this.ms =ms;
    }

    @Override
    public void run() {
        while (true) {
            //为了保证push和pop操作的完整性
            synchronized (ms) {
                while (ms.isEmpty()) {
                    //如果栈空间已满，则wait()等待释放ms的锁标记
                    try {
                        ms.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    char pop = ms.pop();
                    System.out.println("Pop"+pop);
                    ms.notifyAll();
                }
                //push以后随机休息一下
                try {
                    sleep((int)Math.abs(Math.random()*100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
