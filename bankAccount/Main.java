package bankAccount;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner consoleInput = new Scanner(System.in);
        String command = consoleInput.nextLine();

        while (!command.equals("End")){
            String[] tokens = command.split("\\s+");
            String actualCommand = tokens[0];
            BankAccount bankAccount;

            if(actualCommand.equals("Create")){
                bankAccount = new BankAccount();
            } else if (actualCommand.equals("SetInterest")) {
                int id= Integer.parseInt(tokens[1]);
                int ammount= Integer.parseInt(tokens[2]);
            } else if (actualCommand.equals("GetInterest")) {

            } else {
                System.out.println("Invalid command");
            }

            command = consoleInput.nextLine();
        }
    }
}
