package com.epam.homework6.task1;

/**
 * Created by Tetiana_Moskalenko on 10/31/2019.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius= " + radius;
    }

    @Override
    public double calcArea() {
        if (radius > 0) {
            return Math.PI * (radius * radius);
        } else {
            return super.calcArea();
        }
    }
}
