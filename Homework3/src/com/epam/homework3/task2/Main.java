package com.epam.homework3.task2;

import java.util.Scanner;

import java.io.*;

/**
 * Created by Tetiana_Moskalenko on 10/24/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number -> ");
        int number = Integer.parseInt(sc.next());
        binaryNumber(number);
    }

    public static void binaryNumber (int number) {
        String str = "";
        while (number != 0) {
            int res = number % 2;
            number = number / 2;
            str += res;
        }
        String result = new StringBuffer(str).reverse().toString();
        System.out.println(result);
    }
}
