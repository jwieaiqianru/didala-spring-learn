package com.didala.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class bufferStream {

    public static void testBufferInputputStrean()throws Exception {
        BufferedInputStream bufferedInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream
                    ("/Users/jiangwei/Documents/testmkdir/abc.txt");
             bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] bytes = new byte[10];
            int len = 0;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print((char)bytes[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            bufferedInputStream.close();
        }

    }

    public static void main(String[] args) throws Exception{
        testBufferInputputStrean();
    }
}
