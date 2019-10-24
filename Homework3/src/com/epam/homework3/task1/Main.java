package com.epam.homework3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text -> ");
        String str = sc.next();
        uniChars(str);
    }

    public static void uniChars(String str) {
        int index = 0;
        String res = "";
        while ( index < str.length()) {
            char ch = str.charAt(index);
            if ( !res.contains(String.valueOf(ch))) {
                res += ch;
            }
            index++;
        }
        System.out.println(res);
    }
}
