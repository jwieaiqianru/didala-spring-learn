package com.didala.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class FileLearn {
    /**
     * 文件操作
     */
    public void testFile() {
        File file = new File("/Users/jiangwei/Documents");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        File file2 = new File("/Users/jiangwei/Documents");
        Arrays.stream(file2.listFiles()).forEach(System.out::println);
    }

    /**
     * 输入节点流
     * @throws IOException
     */
    public static void fileInputStream() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream
                    ("/Users/jiangwei/Documents/testmkdir/abc.txt");
            int ch = 0;
            while ((ch = fileInputStream.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
    }

    /**
     * 以数组的形式
     * @throws IOException
     */
    public static void fileInputStream2() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream
                    ("/Users/jiangwei/Documents/testmkdir/abc.txt");
            byte[] bytes = new byte[6];
            int len = 0;
            while ((len = fileInputStream.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.println((char) bytes[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }

    /**
     * 输出字段到本机
     * @throws IOException
     */
    static void fileOutStream() throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream=  new FileOutputStream("/Users/jiangwei/Documents/testmkdir/test" +
                    ".txt",true);
            String out = "Hello World";
            byte[] bytes = out.getBytes();
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }
    }


    public static void main(String[] args) throws IOException {
        fileOutStream();
    }
}
