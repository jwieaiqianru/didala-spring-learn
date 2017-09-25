package com.didala.spring.bean.dessert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
@Configuration
public class DessertConfig {
    private Dessert dessert;

    /**
     * 当自动装配遇到歧义时
     * 可以用@Primary 表示首选项
     * @return
     */
    @Bean
    @Primary
    public Dessert cookies() {
        return new Cookies();
    }
    @Bean
    public Dessert cake() {
        return  new Cake();
    }
    public void setDessert(Dessert dessert) {
        this.dessert =dessert;
    }
}
