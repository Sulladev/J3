package ru.gb.jthree.lesson_4.classwork;

public class Example_Sync_2 {
    private Object lock1 = new Object();

    public static void main(String[] args) {
        Example_Sync_2 e2 = new Example_Sync_2();
        System.out.println("Старт main потока");
        new Thread(() -> e2.method1()).start();
        new Thread(() -> e2.method1()).start();
    }

    public void method1() {
        System.out.println("Метод запущен");
        System.out.println("Блок 1 начало");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Блок 1 конец");
        synchronized (lock1) {
            System.out.println("Начало синхронизированного блока");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Конец синхронизированного блока");
        }
        System.out.println("Метод завершил свою работу");
    }
}

