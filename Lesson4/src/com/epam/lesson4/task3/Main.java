package com.epam.lesson4.task3;

import java.util.Scanner;

/**
 * Created by Tetiana_Moskalenko on 10/24/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word -> ");
        String str1 = sc.next();
        System.out.print("Enter second word -> ");
        String str2 = sc.next();
        uniChars(str1, str2);
    }

    public static void uniChars(String str1, String str2) {
        int index = 0;
        String res = "";
        while ( index < str1.length()) {
            char ch = str1.charAt(index);
            if ( !str2.contains(String.valueOf(ch)) && !res.contains(String.valueOf(ch))) {
                    res += ch;
            }
            index++;
        }
        System.out.println(res);
    }
}
