package VtoriSrok.TrinadesetiFevruari;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        printList(numbers);
        List<String> strings = new ArrayList<>();
        printList(strings);
    }
    public static void printList(List<?> listToPrint) {
        System.out.println(listToPrint);
    }
    public static <T, V> void shout(T thingToShout, V secondThingToShout){
        System.out.println(thingToShout + " " + secondThingToShout + "!!!!");
    }
}