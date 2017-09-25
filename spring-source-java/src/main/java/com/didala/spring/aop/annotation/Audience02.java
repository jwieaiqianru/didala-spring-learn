package com.didala.spring.aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/25.
 */
@Aspect
public class Audience02 {
    @Pointcut("execution(** com.didala.spring.aop.annotation.Performance.perform(..)")
    public void profermance() {
    }

    @Before("profremance()")
    public void beforePerform() {
        System.out.println("Silencing cell phones");
        System.out.println("Taking seats");
    }
    @AfterReturning("profremance()")
    public void  applause() {
        System.out.println("CLAP CLAP CLAP");
    }
    @AfterThrowing("profremance()")
    public void demandRefund() {
        System.out.println(" Demand Refund");
    }
}
