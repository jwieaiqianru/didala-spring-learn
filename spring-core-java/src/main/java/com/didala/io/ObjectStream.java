package com.didala.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class ObjectStream {

    public static void main(String[] args) throws Exception{
        Student stu1 = new Student(" tom", 18);
        Student stu2 = new Student("jerry", 18);
        FileOutputStream fout = new FileOutputStream("/Users/jiangwei/Documents/testmkdir/test" +
                ".txt" );
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(stu1);
        oout.writeObject(stu2);
        oout.close();
        FileInputStream fin = new FileInputStream("/Users/jiangwei/Documents/testmkdir/test.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Student s1 = (Student) oin.readObject();
        Student s2 = (Student) oin.readObject();
        oin.close();
        System.out.println(s1);
        System.out.println(s2);
    }
}
