package com.epam.homework4.task3;

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
        int[] array2 = createNegativeArray(array1);
        System.out.println(Arrays.toString(array2));
        int[] array3 = createPositiveArray(array1);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(60) - 30;
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

    public static int[] createNegativeArray (int[] array) {
        int[] array2 = new int[0];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array2 = Arrays.copyOf(array2, array2.length + 1);
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }

    public static int[] createPositiveArray (int[] array) {
        int[] array3 = new int[0];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array3 = Arrays.copyOf(array3, array3.length + 1);
                array3[j] = array[i];
                j++;
            }
        }
        return array3;
    }

}
