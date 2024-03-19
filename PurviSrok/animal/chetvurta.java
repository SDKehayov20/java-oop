package PurviSrok.animal;

import java.util.concurrent.TimeUnit;

public class VariableUpdater {
    public static void main(String[] args) {
        // Инициализиране на променливите a и b
        int a = 10;
        int b = 20;

        // Извеждане на текущите стойности на a и b
        System.out.println("Текущи стойности на a и b: a = " + a + ", b = " + b);

        // Изчакване за 3 секунди
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Подмяна на стойностите на a и b
        a = 30;
        b = 40;

        // Извеждане на новите стойности на a и b
        System.out.println("Нови стойности на a и b: a = " + a + ", b = " + b);
    }
}
