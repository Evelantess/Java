package com.epam.lesson6.task1;

/**
 * Created by Tetiana_Moskalenko on 10/28/2019.
 */
public class Animal {
    private String name;
    private int speed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void viewAnimal() {
        System.out.println("Name=" + this.getName() + ", Speed=" + getSpeed() + ", Age=" + getAge());
    }

    public Animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public Animal() {
        this("animal", 5, 2);
    }

    public Animal(String name) {
//        this.name = name;
//        this.speed = 40;
//        this.age = 10;
        this(name, 40, 10);
    }
}
