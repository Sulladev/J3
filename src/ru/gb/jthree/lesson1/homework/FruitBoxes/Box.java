package ru.gb.jthree.lesson1.homework.FruitBoxes;

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
}
