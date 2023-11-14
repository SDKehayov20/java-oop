package EdinnadesetiNoemvri;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Human {
    protected String name;
    private int age;



    private List<String> cars;

    public void addCar(String car){
        this.cars.add(car);
    }

    public List<String> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0){
            throw  new IllegalArgumentException();
        }
        this.age = age;
    }
}
