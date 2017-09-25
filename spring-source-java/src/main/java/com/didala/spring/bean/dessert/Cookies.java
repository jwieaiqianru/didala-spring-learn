package com.didala.spring.bean.dessert;

import org.springframework.stereotype.Component;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
@Component
@Qualifier
public class Cookies implements Dessert {
    public void eat() {
        System.out.println("I   am Cookies");
    }
}
