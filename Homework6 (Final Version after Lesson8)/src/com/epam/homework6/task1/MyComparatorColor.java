package com.epam.homework6.task1;

import java.util.Comparator;

/**
 * Created by Tetiana_Moskalenko on 11/1/2019.
 */
public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape)o1).getColor();
        String color2 = ((Shape)o2).getColor();
        return color1.compareTo(color2);
    }
}
