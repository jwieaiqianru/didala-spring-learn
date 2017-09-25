package com.didala.genericity.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/14.
 */
public class Canvas {

    public void draw(Shape s) {

        s.draw(this);

    }

    public void drawAll(List<? extends Shape> shapes) {

        for (Shape s : shapes) {

            s.draw(this);

        }

    }

    public void addShaps(List<Circle> shapes) {
        shapes.add(0, new Circle());
    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        List<Shape> list = new ArrayList<>();
        Shape shape = new Circle();
        canvas.draw(shape);
        list.add(shape);
        canvas.drawAll(list);
    }
}