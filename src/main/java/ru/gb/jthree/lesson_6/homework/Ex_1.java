package ru.gb.jthree.lesson_6.homework;

/*
Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
необходимо выбросить RuntimeException.
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
 */

import java.util.ArrayList;

public class Ex_1 {


    public static void main(String[] args) {


    }

    public static void afterValueOfFour (int[] array) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

        if (!list.contains(4)) {
            throw new RuntimeException("В массиве должно быть число 4");
        }

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) == 4) {
                list.subList(0, i).clear();
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) == 4) {
                list.remove(i);
            }
        }

    }
}
