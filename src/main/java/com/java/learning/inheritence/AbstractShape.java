package com.java.learning.inheritence;

import java.awt.*;

/**
 * Created by einternicola on 8/29/15.
 */
public abstract class AbstractShape implements Shape {
    private Color shapeColor = Color.BLUE;
    private int drawSize = 10;
    private int x = 50;
    private int y = 50;

    public void setDrawSize(int drawSize) {
        this.drawSize = drawSize;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getDrawSize() {
        return drawSize;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Color getShapeColor() {
        return shapeColor;
    }
}
