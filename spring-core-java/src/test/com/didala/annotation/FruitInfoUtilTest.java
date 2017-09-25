package com.didala.annotation;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class FruitInfoUtilTest {
    @Autowired
    private FruitInfoUtil fruitInfoUtil;
    @Test
    public void getFruitInfo() throws Exception {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }

}