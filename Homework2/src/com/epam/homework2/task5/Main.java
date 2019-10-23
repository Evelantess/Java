package com.epam.homework2.task5;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int r = 1;
        while (r <= 2) {
            int i = 1;
            while (i <= 5) {
                int h = i;
                while (h < 5) {
                    System.out.print(" ");
                    h++;
                }
                int j = i;
                while (j > 0) {
                    System.out.print("*");
                    j--;
                }
                int a = i;
                while (a > 1) {
                    System.out.print("*");
                    a--;
                }
                i++;
                System.out.println();
            }
            r++;
        }
    }
}
