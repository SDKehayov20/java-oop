package findPrimeNumbersInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Начало: ");
        int start = scanner.nextInt();

        System.out.print("Край: ");
        int end = scanner.nextInt();

        System.out.print("На колко части да се раздели: ");
        int numThreads = scanner.nextInt();

        int range = end - start;
        int chunkSize = range / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int startChunk = start + i * chunkSize;
            int endChunk = i == (numThreads - 1) ? end : startChunk + chunkSize - 1;

            for (int j = startChunk; j <= endChunk; j++) {
                if (isPrime(j)) {
                    System.out.print(j+", ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
