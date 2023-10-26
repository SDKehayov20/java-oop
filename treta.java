import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете начало на интервала: ");
        int start = scanner.nextInt();

        System.out.print("Въведете край на интервала: ");
        int end = scanner.nextInt();

        int numberOfThreads = 4; // Брой нишки за разделянето на интервала

        // Създаване на ExecutorService с фиксиран брой нишки
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        int rangeSize = (end - start + 1) / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            int threadStart = start + i * rangeSize;
            int threadEnd = i == numberOfThreads - 1 ? end : threadStart + rangeSize - 1;

            // Задаване на задача за търсене на прости числа в дадения интервал
            executor.execute(new PrimeNumberTask(threadStart, threadEnd));
        }

        // Затваряне на ExecutorService след като всички задачи завършат
        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Програмата завърши изпълнението.");
    }

    static class PrimeNumberTask implements Runnable {
        private int start;
        private int end;

        public PrimeNumberTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            System.out.println("Търсене на прости числа в интервала [" + start + ", " + end + "]");

            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.println("Намерено просто число: " + i);
                }
            }
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
