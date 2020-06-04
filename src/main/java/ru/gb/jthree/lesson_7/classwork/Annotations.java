package ru.gb.jthree.lesson_7.classwork;


import java.lang.reflect.Method;

public class Annotations {
    @MarkingAnnotation
    public void markedMethod() {
        System.out.println("Java");
    }

    public static void main(String[] args) {
        Method[] methods = Annotations.class.getDeclaredMethods();
        for (Method o : methods) {
            if(o.getAnnotation(MarkingAnnotation.class) != null) {
                System.out.println(o);
            }
        }
    }
}

