package FourteenthNovember;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Dragan",20);

        System.out.println(human.getCars().size());

        human.addCar("Porshe");
        human.addCar("BMW");

        System.out.println(human.getCars().size());
    }
}
