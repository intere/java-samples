package com.java.learning.inheritence;

import java.awt.Color;

/**
 * Created by einternicola on 8/29/15.
 */
public class Square extends Rectangle {

    public Square(int size, Color color) {
        super(size, size, color);
    }

    public Square(int size) {
        super(size, size);
    }
}
