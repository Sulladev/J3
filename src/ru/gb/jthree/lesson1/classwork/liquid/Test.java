package ru.gb.jthree.lesson1.classwork.liquid;

public class Test {
    public static void main(String[] args) {

        Glass<Water> gw = new Glass<>(new Water());
        Glass<Metal> gm = new Glass<>(new Metal());
        System.out.println(gw.getRo());
        System.out.println(gm.getRo());

    }
}
