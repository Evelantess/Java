package com.epam.homework6.task1;

/**
 * Created by Tetiana_Moskalenko on 10/31/2019.
 */
public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + "height = " + height + "width = " + width;
    }

    @Override
    public double calcArea() {
        if (height > 0 && width > 0) {
            return height * width;
        } else {
            return super.calcArea();
        }
    }
}
