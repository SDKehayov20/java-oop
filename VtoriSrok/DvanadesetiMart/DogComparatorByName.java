package VtoriSrok.DvanadesetiMart;

import PurviSrok.animal.Dog;

import java.util.Comparator;

public class DogComparatorByName implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.getName().compareTo(o2.getName()) > 0){
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
