package com.epam.homework6.task1;

/**
 * Created by Tetiana_Moskalenko on 10/31/2019.
 */
public abstract class Shape implements Drawable, Comparable {
    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + ": " +
                "color=" + color;
    }

    public abstract double calcArea();

}
