package com.epam.lesson4.task1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "National Aviation";
        String result = getAbr(name);
        System.out.println(result);
    }

    public static String getAbr(String text) {
        String result = "" + text.charAt(0); // == String.valueOf(text.charAt(0));
        int index =  0;
        while ( (index = text.indexOf(' ', index + 1) ) != -1) {
            result += text.charAt(index + 1);
        }
        return result;
    }
}
