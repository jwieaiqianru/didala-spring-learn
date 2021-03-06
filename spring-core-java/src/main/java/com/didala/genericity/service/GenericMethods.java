package com.didala.genericity.service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/14.
 */
public class GenericMethods {

    /**
     * 泛型方法
     * @param a
     * @param c
     * @param <T>
     */
    static <T> void fromArrayToCollection(T[] a, Collection<T> c){

        for (T o : a) {

            c.add(o); // correct

        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];

        Collection<Object> co = new ArrayList<Object>();

        fromArrayToCollection(oa, co);// T 指Object

        String[] sa = new String[100];

        Collection<String> cs = new ArrayList<String>();

        fromArrayToCollection(sa, cs);// T inferred to be String

        fromArrayToCollection(sa, co);// T inferred to be Object

        Integer[] ia = new Integer[100];

        Float[] fa = new Float[100];

        Number[] na = new Number[100];

        Collection<Number> cn = new ArrayList<Number>();

        fromArrayToCollection(ia, cn);// T inferred to be Number

        fromArrayToCollection(fa, cn);// T inferred to be Number

        fromArrayToCollection(na, cn);// T inferred to be Number

        fromArrayToCollection(na, co);// T inferred to be Object

        //fromArrayToCollection(na, cs);// compile-time error
    }
}
