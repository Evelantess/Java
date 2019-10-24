package com.epam.homework3.addTask2;

import java.util.Scanner;

/**
 * Created by Tetiana_Moskalenko on 10/24/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number -> ");
        int number = Integer.parseInt(sc.next());
        buildPyramid(number);
    }

//    public static void buildPyramid(int height) {
//        int i = 1;
//        int j =
//        while (j < height) {
//            while (i < height / 2) {
//                System.out.print(" ");
//                i++;
//            }
//            System.out.println(j);
//            j++;
//
//        }
//    }
}
