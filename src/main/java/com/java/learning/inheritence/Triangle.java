package com.java.learning.inheritence;

import java.awt.*;

/**
 * This is a right triangle, not a "freeform triangle" (keep it simple stupid!)
 * Created by einternicola on 8/29/15.
 */
public class Triangle extends AbstractShape {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int a, int b, Color color) {
        this(a, b);
        setShapeColor(color);
    }

    public Triangle(int a, int b) {
        setSideA(a);
        setSideB(b);
        setSideC((int)Math.sqrt(a*a+b*b));
    }

    public int howManySides() {
        return 3;
    }

    public void draw(Graphics2D graphics) {
        graphics.setPaint(getShapeColor());
        Polygon triangle = new Polygon();
        triangle.addPoint(getX(), getY());
        triangle.addPoint(getX(), getY() + getSideA());
        triangle.addPoint(getX() + getSideB(), getY() + getSideA());
        graphics.fillPolygon(triangle);
    }

    public int getArea() {
        return (int)((getSideA() + getSideB())/2);
    }

    public int getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideC() {
        return sideC;
    }
}
