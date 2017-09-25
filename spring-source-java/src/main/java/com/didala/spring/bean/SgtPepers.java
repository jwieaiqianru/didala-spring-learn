package com.didala.spring.bean;

import org.springframework.stereotype.Component;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 * @Component 这个注释代表该类会作为组件类，spring会自动为这个创建bean
 */
@Component
public class SgtPepers implements  CompactDisc {
    private String title = "Lonely Hearts Clun";

    public void play() {
        System.out.println("Playing:"+title);
    }
}
