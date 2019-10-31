package com.epam.homework6.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] array = {new Rectangle("red", 4, 5),
                new Rectangle("green", 10,12),
                new Rectangle("yellow", 5, 7),
                new Rectangle("black", 3, 4),
                new Circle("white", 10),
                new Circle("black", 12),
                new Circle("clear", -1),
                new Triangle("red", 3, 4,5),
                new Triangle("violet", 1,1, 2)
                        };
        printShapes(array);
        generalAreaCalc(array);
        areaCalcPerShape(array, Rectangle.class);
        areaCalcPerShape(array, Triangle.class);
        areaCalcPerShape(array, Circle.class);
    }

    public static void printShapes(Shape[] array) {
        for (Shape elem: array) {
            System.out.println(elem);
            if (elem.calcArea() > 0) {
                System.out.println(elem.getClass().getSimpleName() + " area = " + elem.calcArea());
            } else {
                System.out.println("This is not a " + elem.getClass().getSimpleName());
            }
        }
    }

    public static void generalAreaCalc(Shape[] array) {
        double result = 0;
        for (Shape elem: array) {
            result = result + elem.calcArea();
        }
        System.out.println("General area is " + result);
    }

    public static void areaCalcPerShape(Shape[] array, Class<?> cls) {
        double[] arrayRes = new double[3];
        double result = 0;
        for (Shape elem : array) {
            if (cls.isInstance(elem)) {
                result = result + elem.calcArea();
            }
        }
        System.out.println("General area of " + cls.getSimpleName() + "s: " + result);
    }
}
