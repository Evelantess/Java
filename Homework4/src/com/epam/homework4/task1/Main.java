package com.epam.homework4.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size = getSize();
        int[] array = createArray(size);
        printArrays(array);
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        return array;
    }

    public static void printArrays(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------");
        reverse(array);
    }

    public static void reverse(int[] array) {
        System.out.print("[");
        System.out.print(array[array.length - 1]);
        for (int i = (array.length - 2) ; i >= 0; i--) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
    }

    public static int getSize() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (true) {
            System.out.print("Please enter number ->");
            size = sc.nextInt();
            if (size > 0) {
                return size;
            }
            System.out.print("Invalid number. Please repeat.");
        }
    }
}
