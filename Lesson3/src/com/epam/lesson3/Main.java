package com.epam.lesson3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 1;
        int b = 10;
        int c = 7;
        if (a > c && a > b) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else if (c > b && c > a) {
            System.out.println(c);
        }
    }
}
