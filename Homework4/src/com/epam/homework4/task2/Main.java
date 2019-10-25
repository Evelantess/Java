package com.epam.homework4.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tetiana_Moskalenko on 10/25/2019.
 */
public class Main {

    public static void main(String[] args) {
        int size = getSize();
        int[] array1 = createArray(size);
        System.out.println(Arrays.toString(array1));
        int[] array2 = createArray(size);
        System.out.println(Arrays.toString(array2));
        int[] array3 = sumOfArrays(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        return array;
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

    public static int[] sumOfArrays (int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        return array3;
    }
}
