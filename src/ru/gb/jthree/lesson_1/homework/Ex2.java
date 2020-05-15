package ru.gb.jthree.lesson_1.homework;

/*
Написать метод, который преобразует массив в ArrayList;
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String[] array = new String[] {"bla", "bla", "bla"} ;

        System.out.println(arrayToArrayList(array));
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(array));
        return list;
    }
}
