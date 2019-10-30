package com.epam.homework5.task1;

import java.util.Arrays;

/**
 * Created by Tetiana_Moskalenko on 10/28/2019.
 */
public class Books {
    private Book[] booksArray;
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Books(int booksAmount) {
        this.booksArray = new Book[booksAmount];
    }

    public void printBooks() {
        if (counter == 0) {
            System.out.println("No books");
        } else {
            for (int i = 0; i < counter; i++){
                    booksArray[i].viewBook();
                }
            }
        }

    public boolean addBook (Book book) {
        if (counter == booksArray.length) {
            return false;
        } else {
            booksArray[counter] = book;
            setCounter(counter += 1);
            return true;
        }
    }

    public void priceChange(int percent) {
        for (int i = 0; i < counter; i++) {
            booksArray[i].setPrice(booksArray[i].getPrice() + (booksArray[i].getPrice() * percent / 100));
        }
    }

    public void searchBook (String author) {
        Books res = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (booksArray[i].getAuthor().equalsIgnoreCase(author)) {
                res.addBook(booksArray[i]);
            }
        }
        System.out.println("Search result:");
        res.printBooks();
    }

    public void searchBook (int year) {
        Books res = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (booksArray[i].getYear() > year) {
                res.addBook(booksArray[i]);
            }
        }
        System.out.println("Search result:");
        res.printBooks();
    }
}
