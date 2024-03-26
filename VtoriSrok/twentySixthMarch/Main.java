package VtoriSrok.twentySixthMarch;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 10;

        test2(a);

        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test1() throws FileNotFoundException {
        BufferedReader reader =
                new BufferedReader(new FileReader("src/main/resources/input.txt"));
    }
    private static void test2(int a) {
        if(a < 0){
            throw new IllegalArgumentException();
        }
    }
}