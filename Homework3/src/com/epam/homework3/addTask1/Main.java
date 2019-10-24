package com.epam.homework3.addTask1;

import java.util.Scanner;

/**
 * Created by Tetiana_Moskalenko on 10/24/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number -> ");
        String number = sc.next();
        lastNumbersReverse(number);
    }

    public static void lastNumbersReverse(String number) {
        int index1 = number.length() - 1;
        int index2 = index1 - 1;
        String str = "";
        if (index2 != -1) {
            str = str + number.charAt(index1) + number.charAt(index2);
            System.out.println(str);
        }
    }
}
