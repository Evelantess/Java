package com.epam.homework2.task2;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int j = i;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            int h = i;
            while (h > 0) {
                System.out.print(" ");
                h--;
            }
            i++;
        }
    }
}
