package com.didala.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class ReaderAndWriter {

    static void testBufferedReader()throws Exception{
        BufferedReader bufferedReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/jiangwei/Documents/testmkdir/abc.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            bufferedReader.close();
        }
    }

    public static void main(String[] args)throws Exception {
        testBufferedReader();
    }
}
