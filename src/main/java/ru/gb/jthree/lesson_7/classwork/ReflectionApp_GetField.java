package ru.gb.jthree.lesson_7.classwork;

import java.lang.reflect.Field;

public class ReflectionApp_GetField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class catClass = Cat.class;
        Field[] publicFields = catClass.getFields();
        Field f = catClass.getDeclaredField("name");
        System.out.println("Тип_поля Имя_поля : " + f.getType().getName() + " " + f.getName());
        for (Field o : publicFields) {
            System.out.println("Тип_поля Имя_поля : " + o.getType().getName() + " " + o.getName());
        }
    }
}
