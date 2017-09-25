package com.didala.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/25.
 */
@Aspect
public class TrackCounter {

    private Map<Integer,Integer>  trackCounts =   new HashMap<Integer,Integer>();

    @Pointcut("execution(* com.didala.spring.bean.CompactDisc.play(int))&&args(trackNumbers)")
    public void trackCounts(int trackNumbers) {
    }


}
