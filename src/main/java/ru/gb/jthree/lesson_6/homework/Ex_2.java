package ru.gb.jthree.lesson_6.homework;

/*
Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 */

import java.util.ArrayList;

public class Ex_2 {
    public static void main(String[] args) {
        checkForOneAndFour(new int[]{2,3,6,7,9,0,25});
    }

    public static boolean checkForOneAndFour (int[]array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

        boolean output = true;

        if (!list.contains(1) || !list.contains(4)) {
            output = false;
        }

        return output;
    }
}
