package com.epam.homework5.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Books shelf = new Books(10);
        shelf.printBooks();
        System.out.println(shelf.addBook(new Book ("very interesting",
                "T. Moskalenko",
                "ABC",
                1992,
                506,
                42) ) );
        shelf.printBooks();
        System.out.println("__________________________");
        shelf.addBook(new Book("some new book",
                "A. Moskalenko",
                "ABC",
                2002,
                344,
                65) );
        shelf.addBook(new Book("some new book 2",
                "V. Tarasenko",
                "ABC",
                1995,
                176,
                95) );
        shelf.addBook(new Book("some new book 3",
                "S. Viter",
                "HYTG",
                2010,
                567,
                89) );
        shelf.addBook(new Book("some new book 4",
                "S. Viter",
                "HYTG",
                2005,
                367,
                79) );
        shelf.printBooks();
        shelf.priceChange(getPercent());
        System.out.println("___________");
        shelf.printBooks();
        System.out.println("_______________________");
        shelf.searchBook(getYear());
        shelf.searchBook(getAuthor());
    }

    public static int getPercent() {
        Scanner sc = new Scanner(System.in);
        int percent = 0;
        System.out.print("Please enter percent ->");
        percent = sc.nextInt();
        return percent;
    }

    public static int getYear() {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        while (true) {
            System.out.print("Please enter year for search ->");
            year = sc.nextInt();
            if (year > 0) {
                return year;
            }
            System.out.print("Invalid year. Please repeat.");
        }
    }

    public static String getAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter author ->");
        String author = sc.nextLine();
        return author;
    }
}
