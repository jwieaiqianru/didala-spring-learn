package com.didala.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
@Target(ElementType.TYPE)
public @interface Table {

    public String tableName() default "className";

}
