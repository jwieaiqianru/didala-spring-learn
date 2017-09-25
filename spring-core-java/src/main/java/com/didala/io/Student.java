package com.didala.io;

import java.io.Serializable;

import lombok.Data;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/23.
 */
@Data
public class Student implements Serializable{

    private String name;
    private Integer age;
    public Student() {

    }
    public Student(String name  ,
                   Integer age) {
        this.name = name;
        this.age=age;
    }
}
