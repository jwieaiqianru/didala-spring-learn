package com.didala.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/25.
 * 环绕式切面
 */
@Aspect
public class AudienceAround {
    @Pointcut("execution(** com.didala.spring.aop.annotation.Performance.perform(..)")
    public void profermance() {
    }

    @Around("profermance()")
    public void watchProfermance(ProceedingJoinPoint joinPoint) {
        System.out.println("Silencing cell phones");
        System.out.println("Taking seats");
        try {
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println(" Demand Refund");
        }
    }
}
