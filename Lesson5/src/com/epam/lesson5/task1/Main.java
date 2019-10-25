package com.epam.lesson5.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (true) {
            System.out.print("Please enter number ->");
            size = sc.nextInt();
            if (size > 0) {
                break;
            }
            System.out.print("Invalid number. Please repeat.");
        }
        int[] array = createArray(size);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        array[0] = 2;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + 2;
        }
        return array;
    }
}
