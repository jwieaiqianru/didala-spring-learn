package com.didala.spring.aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/25.
 *  对 Performmance 的进行aop
 */
@Aspect
public class Audience {

    @Before("execution(** com.didala.spring.annotation.Performance.perform(..)")
    public void beforePerform() {
        System.out.println("Silencing cell phones");
        System.out.println("Taking seats");
    }
    @AfterReturning("execution(** com.didala.spring.annotation.Performance.perform(..)")
    public void  applause() {
        System.out.println("CLAP CLAP CLAP");
    }
    @AfterThrowing("execution(** com.didala.spring.annotation.Performance.perform(..)")
    public void demandRefund() {
        System.out.println(" Demand Refund");
    }

}
