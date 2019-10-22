package com.epam.example3;

/**
 * Created by Tetiana_Moskalenko on 10/22/2019.
 */
public class Main {
    public static void main (String[] args) {
        int line = 1;
        while (line <= 8) {
            int digit = line;
            while (digit > 0) {
                System.out.print(digit);
                digit--;
            }
            System.out.println();
            line++;
        }
    }
}
