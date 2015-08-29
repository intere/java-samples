package com.java.learning.inheritence;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by einternicola on 8/29/15.
 */
public class ShapeViewerUI extends JPanel implements ActionListener {
    private final int DELAY = 500;  // Timer Interval is a half a second
    private Timer timer;            // The timer to run 2 times per second (roughly)
    private List<AbstractShape> shapes = new ArrayList<AbstractShape>();    // List of shapes.

    /** Entry point to the application.  */
    public static void main(String []args) {
        new ShapeViewerUI();  // Just create a new ShapeViewerUI.
    }

    /** Constructor.  */
    public ShapeViewerUI() {
        super();
        configureShapes();
        createAndAddMeToMyParentPanel();
        initTimer();
    }

    // Star the timer!
    protected void initTimer() {
        timer = new Timer(DELAY, this); // this timer will notify me via the actionPerformed callback method.
        timer.start();
    }

    /**
     * Creates a "parent" JFrame and adds this JPanel to it.
     */
    protected void createAndAddMeToMyParentPanel() {
        JFrame parent = new JFrame("Shape Viewer - in da hizzy!");
        parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parent.setSize(800, 600);
        parent.add(this);

        parent.setVisible(true);
    }

    /**
     * Regenerates the shapes (random size, random color, random position).
     */
    private void configureShapes() {
        shapes.clear();
        shapes.add(new Circle(getRandomSize(), getRandomColor()));
        shapes.add(new Rectangle(getRandomSize(), getRandomSize(), getRandomColor()));
        shapes.add(new Square(getRandomSize(), getRandomColor()));
        shapes.add(new Triangle(getRandomSize(), getRandomSize(), getRandomColor()));


        for(int i=0; i<shapes.size(); i++) {
            AbstractShape shape = shapes.get(i);
            shape.setX((int) (Math.random() * (getWidth() - shape.getDrawSize())));
            shape.setY((int)(Math.random() * (getHeight() - shape.getDrawSize())));
        }
    }

    @Override
    /* This method performs the actual drawing of the shapes themselves.  */
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g.create();
        for(Shape shape : shapes) {
            shape.draw(g2d);
        }
    }

    /**
     * This method fires when the timer updates.  We reconfigure the shapes, then redraw.
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        configureShapes();
        repaint();
    }

    /**
     * Pick a random size between 10 and 400
     * @return
     */
    protected int getRandomSize() {
        return (int)(10 + Math.random() * 390);
    }

    /**
     * Pick a random color (RGB).
     * @return
     */
    protected Color getRandomColor() {
        int r = (int)(Math.random() * 255);
        int g = (int)(Math.random() * 255);
        int b = (int)(Math.random() * 255);
        return new Color(r, g, b);
    }
}
