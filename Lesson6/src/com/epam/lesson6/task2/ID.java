package com.epam.lesson6.task2;

/**
 * Created by Tetiana_Moskalenko on 10/28/2019.
 */
public class ID {
    private static int nextId = (int)(Math.random() * 100 + 1);
    private int id;

    public ID() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
