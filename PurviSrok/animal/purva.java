package PurviSrok.animal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Създаване на ExecutorService с пул от 2 нишки
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Задаване на 3 задачи за изпълнение
        for (int i = 0; i < 3; i++) {
            executor.submit(new Task());
        }

        // Затваряне на ExecutorService след като всички задачи завършат
        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Дефиниране на задача, която извежда числата от 1 до 5
    static class Task implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread: " + Thread.currentThread().getId() + " - Number: " + i);
                try {
                    Thread.sleep(1000); // Интервал от 1 секунда
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
