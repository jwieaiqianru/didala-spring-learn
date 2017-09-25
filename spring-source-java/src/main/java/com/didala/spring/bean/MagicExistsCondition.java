package com.didala.spring.bean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 */
public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
       Environment environment= context.getEnvironment();
        return environment.containsProperty("magic");
    }
}
