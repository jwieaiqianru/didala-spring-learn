package com.didala.prototype.model;

import lombok.Data;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/19.
 */
@Data
public class TestClone1  implements  Cloneable{

    private Integer id;
    private String name;
    private Integer age;
    private String address;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
