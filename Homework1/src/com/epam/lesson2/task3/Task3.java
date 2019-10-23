package com.epam.lesson2.task3;

public class Task3 {

    public static void main(String[] args) {
        lbToKg(254);
    }

    public static void lbToKg(double lb) {
        double kg = lb * 4.536E-01;
        int g = (int) (kg % (double) ((int) kg) * 1000);
        System.out.println(lb + " lb is " + (int) kg + " kg " + "and " + g + " g");
    }
}
