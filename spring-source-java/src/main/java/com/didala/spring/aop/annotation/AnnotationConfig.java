package com.didala.spring.aop.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/25.
 */
@Configuration
@EnableAspectJAutoProxy
public class AnnotationConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Audience02 audience02() {
        return  new Audience02();
    }
}
