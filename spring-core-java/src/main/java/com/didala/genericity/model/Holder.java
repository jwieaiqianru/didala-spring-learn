package com.didala.genericity.model;

import com.didala.io.Student;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
public class Holder<T> {
    private T t;

    public Holder(T t) {
        this.t=t;
    }
    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Holder<Student> studentHolder = new Holder<>(new Student());
        Student student = studentHolder.get();
    }
}
