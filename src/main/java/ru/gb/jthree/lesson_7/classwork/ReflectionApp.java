package ru.gb.jthree.lesson_7.classwork;

public class ReflectionApp {
    public static void main(String[] args) {
        Class stringClass = "Java".getClass();
        Class integerClass = Integer.class;

        Class intClass = int.class;
        Class voidClass = void.class;
        Class charArrayClass = char[].class;


        System.out.println("Полное имя класса: " + stringClass.getName());
        System.out.println("Простое имя класса: " + stringClass.getSimpleName());


    }
}
