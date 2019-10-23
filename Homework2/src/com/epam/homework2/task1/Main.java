package com.epam.homework2.task1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 1;
        while (i<=5) {
            int j = i;
            while (j>0) {
                System.out.print("*");
                j--;
            }
            i++;
            System.out.println();
        }
        i = 1;
        while (i<=5) {
            int j = i;
            while (j < 5) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
