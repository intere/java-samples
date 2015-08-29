package com.java.learning.inheritence;

import java.awt.*;

/**
 * Created by einternicola on 8/29/15.
 */
public class Rectangle extends AbstractShape {
    private int width;
    private int height;

    public Rectangle(int width, int height, Color color) {
        this(width, height);
        setShapeColor(color);
    }

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        setDrawSize((int)Math.sqrt(width*width + height*height));
    }

    public int howManySides() {
        return 4;
    }

    public void draw(Graphics2D graphics) {
        graphics.setPaint(getShapeColor());
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public int getArea() {
        return getHeight() * getWidth();
    }

    public int getPerimeter() {
        return getHeight() * 2 + getWidth() * 2;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
