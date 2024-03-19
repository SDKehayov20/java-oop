package PurviSrok.SedmiNoemvri;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower){
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getFuel() {
        return fuel;
    }

    public void drive(double kilometers){
        double fuelThatWillBeConsumed = kilometers * fuelConsumption;
        if(fuelThatWillBeConsumed > fuel){
            System.out.println("Not enough fuel to drive");
        }
        else {
            fuel -= fuelThatWillBeConsumed;
        }
    }

}
