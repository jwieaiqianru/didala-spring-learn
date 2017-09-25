package com.didala.thread;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class MyStack {

    private char[] data = new char[5];
    private int index = 0;
    public char pop(){
        index -- ;
        return data[index];
    }
    public void push(char ch){
        data[index] = ch;
        index++;
    }
    public void print(){
        for (int i=0; i<index; i++){
            System.out.print(data[i] + " \t");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return index == 0;
    }
    public boolean isFull(){
        return index == 5;
    }
}
