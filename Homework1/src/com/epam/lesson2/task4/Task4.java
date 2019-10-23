package com.epam.lesson2.task4;

public class Task4 {
    public static void main(String[] args) {
        incomeCalc(10000, 6, 12);
    }

    public static void incomeCalc (double amount, int months, int percent) {
        double result = amount;
        for (int i = 0; i < months; i++) {
            result = result * ((double) percent) / 12 / 100 + result;
        }
        result = result - amount;
        System.out.println("The income is: " + result);
    }
}



