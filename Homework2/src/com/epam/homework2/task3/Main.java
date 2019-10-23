package com.epam.homework2.task3;

public class Main {
    public static void main(String[] args) {
                // write your code here
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
                    i++;
            System.out.println();
        }
    }
}
