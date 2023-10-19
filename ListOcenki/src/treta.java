import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordList
{
    public static void main(String[] args)
    {
        List<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Изберете опция:");
            System.out.println("1. Добави дума");
            System.out.println("2. Изведи всички думи");
            System.out.println("3. Провери дали дума се среща");
            System.out.println("4. Изход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Въведете дума: ");
                    String word = scanner.nextLine();
                    wordList.add(word);
                    System.out.println("Думата е добавена към списъка.");
                    break;
                case 2:
                    System.out.println("Всички думи в списъка са:");
                    for (String w : wordList) {
                        System.out.println(w);
                    }
                    break;
                case 3:
                    System.out.print("Въведете дума за проверка: ");
                    String searchWord = scanner.nextLine();
                    if (wordList.contains(searchWord))
                    {
                        System.out.println("Думата се среща в списъка.");
                    }
                    else
                    {
                        System.out.println("Думата не се среща в списъка.");
                    }
                    break;
                case 4:
                    System.out.println("Излизане от програмата.");
                    System.exit(0);
            }
        }
    }
}