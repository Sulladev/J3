package ru.gb.jthree.lesson_6.homework;

import sun.security.krb5.internal.PAEncTSEnc;

public class Ex1WithArray {
    public static void main(String[] args) {

    }
    public int[] firstTask(int[]array) {
        int[] result = new int[array.length];
        int j = 0;
        int i = array.length - 1;
        boolean digitFour = false;
        for (int x: array) {
            if (x == 4) {
                digitFour = true;
                result = new int[i];
                j = 0;
                i--;
            } else {
                result[j] = x;
                j++;
                i--;
            }
        }
        if (digitFour) {
            return result;
        } else {
            throw new RuntimeException("В массиве нет ни одной цифры 4");
        }
    }

}
