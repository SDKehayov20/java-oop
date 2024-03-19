package VtoriSrok.DvanadesetiMart;

import PurviSrok.animal.Dog;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Lucky", "Beagle", 5));
        dogs.add(new Dog("Richo", "Pincher", 7));
        dogs.add(new Dog("Rex", "German Sheppard", 2));
        dogs.add(new Dog("Ares", "German Sheppard", 2));
        Collections.sort(dogs);

        DogComparatorByAge dogComparatorByAge = new DogComparatorByAge();
        dogs.sort(dogComparatorByAge);
        dogs.sort(new DogComparatorByName());

//        List<String> names = new ArrayList<>();
//        names.add("Ivan");
//        names.add("Dragan");
//        names.add("Petkan");
//        Collections.sort(dogs);
//
//        Dog first = new Dog("Gosho", "Pug", 10);
//        Dog second = new Dog("Stay", "Boxer", 5);
//
//        System.out.println(first.compareTo(second));

        for (Dog dog: dogs) {
            System.out.println(dog.getName() + " " + dog.getBreed() + " " + dog.getAge());
        }
    }
}
