package com.epam.lesson4.task2;

/**
 * Created by Tetiana_Moskalenko on 10/24/2019.
 */
public class Main {
    public static void main(String[] args) {
        String text = "An information system is designed for";
        System.out.println(updateStr(text));
    }

    public static String updateStr(String text) {
        int pos1 = text.indexOf(" ");
        String wordFirst = text.substring(0, pos1);
        int pos2 = text.lastIndexOf(" ");
        String wordLast = text.substring(pos2 + 1, text.length());
        return wordLast + text.substring(pos1, pos2 + 1) + wordFirst;
    }
}
