package PetiDekemvri.Purva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
        String[] tokens = input.split("");
        if(tokens.length == 2){
            String model = tokens[0];
            String id = tokens[1];
            Robot robot = new Robot(id, model);
        }else if(tokens.length == 3){
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String id = tokens[2];
            Citizen citizen = new Citizen(name, age, id);
        }else{
            throw new IllegalArgumentException("Invalid input");
        }

            input = scanner.nextLine();
        }

        String idDigits = scanner.nextLine();
        for(Identifiable identity : identifiables){
            if(identity.getId().endsWith(idDigits)){
                System.out.println(identity.getId());
            }
        }
    }
}
