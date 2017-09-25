package com.didala.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 *
 * @ComponentScan 让spring启用组件扫描，如果没有其他配置，默认扫描配置类相同的包
 *                             属于自动扫描
 * @Configuration  表面这是一个配置类
 */
@Configuration
//@ComponentScan(value = "com.didala.spring")
public class CDPlayerConfig {

    /**显示声明的bean
     *
     * @return
     */
    @Bean(name = "sgtPepers")
    public CompactDisc sgtPepers() {
        return new SgtPepers();
    }


    @Bean
    public SgtPepers cDplayer() {
        return  new SgtPepers();
    }
    //条件化配置bean
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
