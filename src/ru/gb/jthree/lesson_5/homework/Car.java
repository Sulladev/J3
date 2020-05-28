package ru.gb.jthree.lesson_5.homework;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private static CyclicBarrier cyclicBarrierReady;
    private static CountDownLatch countDownLatchStart;
    private static CountDownLatch countDownLatchFinish;



    static {
        cyclicBarrierReady = MainClass.cyclicBarrierReady;
        countDownLatchStart = MainClass.countDownLatchStart;
        countDownLatchFinish = MainClass.countDownLatchFinish;

    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }


    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
//            countDownLatchStart.await();
            System.out.println(this.name + " готов");
            cyclicBarrierReady.await();

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int j = 0; j < race.getStages().size(); j++) {
            race.getStages().get(j).go(this);
            try {
//                countDownLatchFinish.await();
                cyclicBarrierReady.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

    }

}
