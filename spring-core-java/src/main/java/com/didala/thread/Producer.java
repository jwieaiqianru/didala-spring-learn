package com.didala.thread;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class Producer extends Thread{

    private MyStack ms;

    public Producer(MyStack ms) {
        this.ms=ms;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ms) {
                while (ms.isFull()) {
                    try {
                        this.ms.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ms.push('A');
                    System.out.println("push A");
                    ms.notifyAll();
                }
                //push 之后随机休眠一段时间
                try {
                    sleep( (int)Math.abs(Math.random() * 200) );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
