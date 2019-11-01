package com.epam.homework6.task1;

/**
 * Created by Tetiana_Moskalenko on 10/31/2019.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public double calcArea() {
        if (a + b > c && b + c > a && a + c > b) {
            final double sqrt = Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
            return  sqrt/4;
        }
        return 0;
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
