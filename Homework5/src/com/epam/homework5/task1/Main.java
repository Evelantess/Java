package com.epam.homework5.task1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Books array = new Books(5);
        System.out.println(array);
        Book book1 = new Book("very interesting", "T. Moskalenko", "ABC", 1992, 506, 42);
        Books.addBooks(array, book1);
    }
}
