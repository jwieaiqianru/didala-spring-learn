package com.didala.annotation;

import java.lang.reflect.Field;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName annotation = field.getAnnotation(FruitName.class);
                System.out.println(strFruitName+annotation.value());
            }else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor annotation = field.getAnnotation(FruitColor.class);
                System.out.println(strFruitColor+annotation.fruitColor());
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
            Thread thread = new Thread();
        }
    }
}
