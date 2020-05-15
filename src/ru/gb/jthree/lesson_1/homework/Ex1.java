package ru.gb.jthree.lesson_1.homework;

import java.util.Arrays;

/*
Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
 */
public class Ex1 {

    public static void main(String[] args) {
       Integer[] array = new Integer [] {1,2,3,4,5};
       changeAnElement(array, 1,4);
       System.out.println(Arrays.toString(array));
    }

    public static <T> void changeAnElement (T[] array, int index1, int index2) {

        try {
            T tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException. Массив длиной " + array.length + " элементов");
        }


    }
}
