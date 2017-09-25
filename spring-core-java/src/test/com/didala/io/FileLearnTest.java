package com.didala.io;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class FileLearnTest {
    @Autowired
    private FileLearn fileLearn;
    @Test
    public void testFile() throws Exception {

    }

    @Test
    public void fileInputStream() throws Exception {
        fileLearn.fileInputStream();
    }

}