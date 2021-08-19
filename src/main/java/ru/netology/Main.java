package ru.netology;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final ThreadGroup mainGroup = new ThreadGroup("main group");

        final Thread thread1 = new MyThread(mainGroup, "Поток 1");
        final Thread thread2 = new MyThread(mainGroup, "Поток 2");
        final Thread thread3 = new MyThread(mainGroup, "Поток 3");
        final Thread thread4 = new MyThread(mainGroup, "Поток 4");

        thread1.start();
        sleep(500);
        thread2.start();
        sleep(500);
        thread3.start();
        sleep(500);
        thread4.start();

        sleep(15000);
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();

    }
}
