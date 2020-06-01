package ru.gb.jthree.lesson_1.classwork;

public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        System.out.println(value);
        return String.format("(%s, %s)", key.toString(), value.toString());
    }
}
