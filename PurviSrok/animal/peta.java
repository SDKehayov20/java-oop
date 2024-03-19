package PurviSrok.animal;

import java.util.concurrent.TimeUnit;

public class Restaurant {
    private int numberOfTables;
    private boolean[] tables;

    public Restaurant(int numberOfTables) {
        this.numberOfTables = numberOfTables;
        this.tables = new boolean[numberOfTables];
        for (int i = 0; i < numberOfTables; i++) {
            tables[i] = false;
        }
    }

    public synchronized int findFreeTable() {
        for (int i = 0; i < numberOfTables; i++) {
            if (!tables[i]) {
                tables[i] = true;
                return i;
            }
        }
        return -1; // Няма свободни маси
    }

    public synchronized void releaseTable(int tableNumber) {
        tables[tableNumber] = false;
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5); // Създаване на ресторант с 5 маси

        for (int i = 1; i <= 10; i++) {
            Thread client = new Thread(new Client(restaurant, i));
            client.start();
        }
    }

    static class Client implements Runnable {
        private Restaurant restaurant;
        private int clientNumber;

        public Client(Restaurant restaurant, int clientNumber) {
            this.restaurant = restaurant;
            this.clientNumber = clientNumber;
        }

        @Override
        public void run() {
            try {
                int tableNumber = restaurant.findFreeTable();
                if (tableNumber != -1) {
                    System.out.println("Клиент " + clientNumber + " седна на маса " + tableNumber);

                    // Симулиране на времето за консумация
                    int consumptionTime = (int) (Math.random() * 10) + 1;
                    TimeUnit.SECONDS.sleep(consumptionTime);

                    System.out.println("Клиент " + clientNumber + " приключи и освободи маса " + tableNumber);
                    restaurant.releaseTable(tableNumber);
                } else {
                    System.out.println("Клиент " + clientNumber + " чака за маса.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
