package com.didala.spring.bean;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CompactDiscTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test01() {
        Assert.assertNotNull(compactDisc);
    }
}