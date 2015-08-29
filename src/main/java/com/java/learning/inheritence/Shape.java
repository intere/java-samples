package com.java.learning.inheritence;

import java.awt.*;

/**
 * Created by einternicola on 8/29/15.
 */
public interface Shape {

    /** This tells us how many sides the shape has.  */
    public int howManySides();

    /** This method will draw the Shape on a Canvas.  */
    public void draw(Graphics2D graphics);

    /** This method tells you the area of the Shape.  */
    public int getArea();

    /** This method tells you the perimeter length of the shape.  */
    public int getPerimeter();
}
