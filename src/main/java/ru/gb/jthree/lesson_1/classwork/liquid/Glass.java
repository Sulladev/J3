package ru.gb.jthree.lesson_1.classwork.liquid;

public class Glass <T extends Liquid> {
    private T liquid;

    public Glass(T liquid) {
        this.liquid = liquid;
    }

    public double getRo() {
        return liquid.get();
    }
}
