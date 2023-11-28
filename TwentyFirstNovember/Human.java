package TwentyFirstNovember;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Human implements Creature {
    protected String name;
    private int age;
    private List<String> cars;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.cars = new ArrayList<>();
    }

    public void addCar(String car){
        this.cars.add(car);
    }

    public void removeCar(String car){
        this.cars.remove(car);
    }

    public abstract void walk();

    public List<String> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    @Override
    public void eat(){

    }

    @Override
    public void sleep() {

    }
}
