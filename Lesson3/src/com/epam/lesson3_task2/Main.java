package com.epam.lesson3_task2;

import java.util.Scanner;

/**
 * Created by Tetiana_Moskalenko on 10/22/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number -> ");
        int number = scanner.nextInt();
        switch (number) {
            default:
                System.out.println("Other"); break;
            case 1:
                System.out.println("one"); break;
            case 2:
                System.out.println("two"); break;
            case 3:
                System.out.println("three"); break;

        }
    }
}
