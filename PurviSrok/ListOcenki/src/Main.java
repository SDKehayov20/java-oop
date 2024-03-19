import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> number = new ArrayList<Integer>();

    public void displayMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new number to the list");
            System.out.println("2. Print all numbers from the list");
            System.out.println("3. Check if a number is on the list");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();
//
            switch (choice) {
                case 1 -> addWord();
                case 2 -> printWords();
                case 3 -> checkWord();
                case 4 -> {
                    System.out.println("Getting the f out");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
    //
    public void addWord() {
        System.out.println("Enter the number to add:");
        int numbers = Integer.parseInt(scanner.nextLine());
        number.add(numbers);
        System.out.println("Number added successfully.");
    }

    public void printWords() {
        System.out.println("Number on the list:");
        for (int numbers : number) {
            System.out.println(numbers);
        }
    }

    public void checkWord() {
        System.out.println("Enter the number to check:");
        int numero = Integer.parseInt(scanner.nextLine());
        if (number.contains(numero)) {
            System.out.println(numero + " is on the list.");
        } else {
            System.out.println(numero + " is not on the list.");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.displayMenu();
    }
}