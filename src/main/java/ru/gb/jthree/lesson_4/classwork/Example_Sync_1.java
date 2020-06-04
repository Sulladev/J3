package ru.gb.jthree.lesson_4.classwork;

public class Example_Sync_1 {
    public static void main(String[] args) {
        Example_Sync_1 e1 = new Example_Sync_1();
        new Thread(() -> e1.method1()).start();
        new Thread(() -> e1.method2()).start();
        new Thread(() -> e1.method3()).start();
    }

    public synchronized void method1() {
        System.out.println("M1 started");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M1 stopped");
    }


    public synchronized void method2() {
        System.out.println("M2 started");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M2 stopped");
    }

    public void method3() {
        System.out.println("M3 started");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M3 stopped");
    }

}


