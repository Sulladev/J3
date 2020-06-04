package ru.gb.jthree.lesson_7.classwork;

import java.lang.reflect.Modifier;

public class ReflectionApp_GetModifier{
    public static void main(String[] args) {
        Class strClass = String.class;
        int modifiers = strClass.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            System.out.println(strClass.getSimpleName() + " - public");
        }
        if (Modifier.isAbstract(modifiers)) {
            System.out.println(strClass.getSimpleName() + " - abstract");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println(strClass.getSimpleName() + " - final");
        }
    }
}

