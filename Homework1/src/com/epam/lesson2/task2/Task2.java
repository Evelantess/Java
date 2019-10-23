package com.epam.lesson2.task2;

public class Task2 {

    public static void calculation(int someNumber) {
        int number = someNumber;
        int newNumber = number;
        int result = 0;
        while (number > 0) {
            result = number % 10 + result * 10;
            number = number / 10;
        }
        int finalResult = result - newNumber;
        System.out.println("If we substract " + newNumber + " from " + result + " we receive: " + finalResult);
    }

    public static void main(String[] args) {
        // write your code
        calculation(256);
    }
}
