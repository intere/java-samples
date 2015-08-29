package com.java.learning.inheritence;

import java.awt.*;

/**
 * Created by einternicola on 8/29/15.
 */
public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius, Color color) {
        this(radius);
        setShapeColor(color);
    }

    public Circle(int radius) {
        setRadius(radius);
        setDrawSize(radius);
    }


    public int howManySides() {
        return 1;
    }

    public void draw(Graphics2D graphics) {
        graphics.setPaint(getShapeColor());
        graphics.fillOval(getX(), getY(), getDrawSize(), getDrawSize());
    }

    public int getArea() {
        return (int)(Math.PI * Math.pow(getRadius(), 2.0));
    }

    public int getPerimeter() {
        return (int)(Math.PI * getRadius() * 2);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
