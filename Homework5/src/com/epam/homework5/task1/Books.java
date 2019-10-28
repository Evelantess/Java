package com.epam.homework5.task1;

import java.util.Arrays;

/**
 * Created by Tetiana_Moskalenko on 10/28/2019.
 */
public class Books {
    private Book [] bookArray;

    public Books(int books) {
        Book[] bookArray = new Book[books];
    }

    public static Book[] addBooks(Book[] bookArray, Book book) {
        Book[] res = new Book[bookArray.length];
        int counter = bookArray.length + 1;
        res = new Book[counter];
        res[counter] = book;
        return res;
    }

    public static void printBooks(Book[] array) {
        if (array.length == 0) {
            System.out.println("No books");
        } else {
            for (Book elem: array) {
                elem.viewBook();
            }
        }
    }

    public static void priceChange(Book[] array, int percent) {
        int price = 0;
        for (Book elem: array) {
            elem.setPrice(elem.getPrice() * percent);
        }
    }

    public static Book[] searchBook (Book[] books, String author){
        Book[] res = new Book[books.length];
        int counter = 0;
        for (Book elem: books) {
            if (elem.getAuthor().equals(author)) {
                res[counter++] = elem;
            }
        }
        return Arrays.copyOf(res, counter);
    }

    public static Book[] searchBook (Book[] books, int year){
        Book[] res = new Book[books.length];
        int counter = 0;
        for (Book elem: books) {
            if (elem.getYear() > year) {
                res[counter++] = elem;
            }
        }
        return Arrays.copyOf(res, counter);
    }

}
