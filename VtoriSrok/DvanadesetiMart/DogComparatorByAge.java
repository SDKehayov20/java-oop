package VtoriSrok.DvanadesetiMart;


import PurviSrok.animal.Dog;

import java.util.Comparator;

public class DogComparatorByAge implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.getAge() == o2.getAge()){
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
