package com.epam.lesson5.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tetiana_Moskalenko on 10/25/2019.
 */
public class Main {
    public static void main(String[] args) {
        int size = getSize();
        int[] array = createArray(size);
        System.out.println("Array: " + Arrays.toString(array));
        int sum =  sumOddElementsArray(array);
        System.out.println(sum);
    }

    public static int sumOddElementsArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element > 0 && element%2 != 0) {
                sum += element;
            }
        }
        return sum > 0 ? sum : -1;
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
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
}

