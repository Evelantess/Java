package com.epam.homework5.task1;

/**
 * Created by Tetiana_Moskalenko on 10/28/2019.
 */
public class Book {
    private String name;
    private int id;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private static int nextId = 1;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String name, String author, String publisher, int year, int pages, int price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;

        this.id = getId();
    }

    private int getId() {
        id = nextId;
        nextId++;
        return id;
    }

    public void viewBook() {
            System.out.println("Book ID = " + id + ", name= " + name + ", author=" + author + ", publisher=" + publisher + ", year =" + year + ", pages =" + pages + ", price = " + price);
    }
}

