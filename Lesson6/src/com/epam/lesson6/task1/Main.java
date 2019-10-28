package com.epam.lesson6.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.viewAnimal();
//        animal.setName("cat");
//        animal.viewAnimal();
//        animal.setAge(5);
//        animal.setSpeed(20);
//        animal.viewAnimal();
//        Animal animal1 = new Animal("Dog");
//        animal1.viewAnimal();
        Animal[] arrayAnimal = {new Animal(),
                new Animal("cat"),
                new Animal("mouse", 15, 6),
                new Animal("dog", 3, 4),
                new Animal("elephant", 35, 25)
        };

        printAnimals(arrayAnimal);
        System.out.println("_____________________________________");
        printAnimals(searchAnimal(arrayAnimal, 5));
        System.out.println("______________________________________");
        printAnimals(searchAnimal(arrayAnimal, "CAT"));
    }

    static void printAnimals(Animal[] array) {
        if (array.length == 0) {
            System.out.println("No animals");
        } else {
            for (Animal elem: array) {
                    elem.viewAnimal();
            }
        }
    }

        static Animal[] searchAnimal (Animal[] animals, int age){
            Animal[] res = new Animal[animals.length];
            int counter = 0;
            for (Animal an : animals) {
                if (an.getAge() > age) {
                    res[counter++] = an;
                }
            }
            return Arrays.copyOf(res, counter);
        }

    static Animal[] searchAnimal (Animal[] animals, String name){
        Animal[] res = new Animal[animals.length];
        int counter = 0;
        for (Animal an : animals) {
            if (an.getName().equals(name)) {
                res[counter++] = an;
            }
        }
        return Arrays.copyOf(res, counter);
    }
}
