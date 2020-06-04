package ru.gb.jthree.lesson_1.homework.FruitBoxes;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits;
    private float weight;
    private T whatFruit;

    public Box() {
        fruits = new ArrayList<>();
        weight = 0;
    }

    public float getWeight() {
        return weight;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void addFruits (T fruit) {
        whatFruit = fruit;
        weight += fruit.getWeight();
        fruits.add(fruit);
    }

    public boolean compare (Box<? extends Fruit> anotherBox) {
        return this.getWeight() > anotherBox.getWeight();
    }

    public void dropFruits(@NotNull Box<? extends Fruit> otherBox) {
        if (whatFruit.getClass() != otherBox.whatFruit.getClass()) {
            throw new DropException();
        }
        for (Fruit fruit : otherBox.fruits) {
            addFruits((T) fruit);
        }
        otherBox.fruits.clear();
        otherBox.weight = 0;
    }

}
