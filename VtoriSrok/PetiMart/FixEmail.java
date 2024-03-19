package VtoriSrok.PetiMart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new HashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")){
            String email = scanner.nextLine();

            if(
                !email.endsWith("us") ||
                !email.endsWith("uk") ||
                !email.endsWith("com")
            )
                emails.put(name,email);


            name = scanner.nextLine();
        }

        for (String key: emails.keySet()) {
            System.out.println(key+ " -> " + emails.get(key));
        }
    }
}
/*
Ivan
ivan@gmail.com
Georgi
georgi@gmail.us
* */
