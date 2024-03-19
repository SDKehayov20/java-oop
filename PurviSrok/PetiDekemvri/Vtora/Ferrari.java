package PurviSrok.PetiDekemvri.Vtora;

public class Ferrari implements Car {
    private String model;
    private String driverName;

    public Ferrari(String driverName) {
        this.model = "488-Spider";
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return model + "/" + brakes() + "/" + gas() + "/" + driverName;
    }
}