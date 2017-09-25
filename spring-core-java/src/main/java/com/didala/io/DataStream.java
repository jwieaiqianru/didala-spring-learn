package com.didala.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 *  过滤流
 */
public class DataStream {
    /**
     * 输入流
     */
    public static void testDataInputStream() {
        DataInputStream dataInputStream =null;
        try {
            InputStream  inputStream = new FileInputStream
                    ("/Users/jiangwei/Documents/testmkdir/test.txt");
            dataInputStream = new DataInputStream(inputStream);
            int i = dataInputStream.readInt();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * data包装输出流
     * @throws Exception
     */
    public static void testDataOutStream()  throws Exception{
        DataOutputStream dataOutputStream =null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/jiangwei/Documents/testmkdir/test.txt");
             dataOutputStream = new DataOutputStream(fileOutputStream);
            int i =19;
            dataOutputStream.writeInt(i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            dataOutputStream.close();
        }
    }

    public static void main(String[] args) throws Exception {
        testDataOutStream();
        testDataInputStream();
    }
}
