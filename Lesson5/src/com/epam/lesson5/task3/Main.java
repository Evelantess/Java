package com.epam.lesson5.task3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Tetiana_Moskalenko on 10/25/2019.
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = createMatrix(5);
        printMatrix(array);
        System.out.println("-----------------------------");
        transpon(array);
        printMatrix(array);
    }

    public static int[][] createMatrix(int size) {
        Random random  = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] = random.nextInt(60) - 30;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row: arr) {
//            System.out.println(Arrays.toString(row));
            for (int elem: row) {
                System.out.printf("%5d", elem);
            }
            System.out.println();
        }
    }

    public static void transpon(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
    }
}
