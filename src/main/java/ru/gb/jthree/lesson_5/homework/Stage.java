package ru.gb.jthree.lesson_5.homework;

public abstract class Stage {
    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}
