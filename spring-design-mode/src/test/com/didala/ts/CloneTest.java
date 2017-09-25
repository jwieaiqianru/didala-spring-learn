package com.didala.ts;

import com.didala.prototype.model.TestClone1;
import com.didala.prototype.model.TestClone2;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/19.
 */
public class CloneTest {

    @Test
    public void test01() throws CloneNotSupportedException {
        TestClone1 testClone1 = new TestClone1();
        testClone1.setName("jiangwei");
        testClone1.setId(2);
        testClone1.setAge(12);
        TestClone2 testClone2 = new TestClone2();
        BeanUtils.copyProperties(testClone1, testClone2);
        System.out.println(testClone2);
    }
}
