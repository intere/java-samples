package com.java.learning.inheritence;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by einternicola on 8/29/15.
 */
public class ShapesTest {

    @Test
    public void testAllAreShapes() {
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle(5));
        shapeList.add(new Rectangle(7, 13));
        shapeList.add(new Square(5));
        shapeList.add(new Triangle(3, 4));

        for(Shape s : shapeList) {
            System.out.println("Shape: " + s.getClass().getSimpleName() + " Area: " + s.getArea() + ", Perimeter: " + s.getPerimeter());
        }
    }
}
