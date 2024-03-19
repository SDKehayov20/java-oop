package PurviSrok.animal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Създаване на ExecutorService с пул от 3 нишки
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Задаване на няколко задачи за изпълнение
        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task(i));
        }

        // Затваряне на ExecutorService след като всички задачи завършат
        executor.shutdown();
    }

    // Дефиниране на задача
    static class Task implements Runnable {
        private int taskId;

        public Task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running on Thread " + Thread.currentThread().getId());
        }
    }
}
