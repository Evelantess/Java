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
            return Math.PI * Math.pow(radius, 2);
        } else {
            return 0;
        }
    }

    @Override
    public void draw() {
        System.out.printf("%s%s%7.2f%n", this.toString(), "; area= ", this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape) {
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }
}
