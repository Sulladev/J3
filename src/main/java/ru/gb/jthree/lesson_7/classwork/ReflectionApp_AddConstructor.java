package ru.gb.jthree.lesson_7.classwork;

import java.lang.reflect.Constructor;

public class ReflectionApp_AddConstructor {
    public static void main(String[] args) {
        Constructor[] constructors = Cat.class.getConstructors();
        for (Constructor o : constructors) {
            System.out.println(o);
        }
        System.out.println("---");
        try {
            System.out.println(Cat.class.getConstructor(new Class[] {String.class, int.class}));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
