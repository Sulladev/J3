package ru.gb.jthree.lesson_4.classwork;

public class Example_Sync_3 {
    public static void main(String[] args) {
        System.out.println("Start");
        new Thread(() -> method()).start();
        new Thread(() -> method()).start();
    }

    public synchronized static void method() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
