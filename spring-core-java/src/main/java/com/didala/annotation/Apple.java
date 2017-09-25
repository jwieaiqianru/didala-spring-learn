package com.didala.annotation;

import lombok.Data;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
@Data
public class Apple {
    @FruitName("apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.BLUE)
    private String  appleColor;

    @FruitProvider(id = 1,name = "苹果供应商",address = "山东省烟台市")
    private String appleProvider;


    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}
