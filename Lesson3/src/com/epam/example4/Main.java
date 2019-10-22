package com.epam.example4;

/**
 * Created by Tetiana_Moskalenko on 10/22/2019.
 */
public class Main {
    public static void main (String[] args) {
        System.out.println("* | 1   2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        int line = 1;
        while (line <= 9) {
            int digit = line;
            System.out.print(line + " |");
            int newNum = 1;
            do {
                System.out.printf("%3d", digit);
                digit = digit + line;
                newNum++;
            }
            while(newNum <= 9);
            line++;
            System.out.println();
        }
    }

}
