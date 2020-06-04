package ru.gb.jthree.lesson_7.classwork;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void meow(int dB) {
        System.out.println(name + ": meow - " + dB + " dB");
    }

}

