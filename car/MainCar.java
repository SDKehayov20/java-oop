package car;

public class MainCar {
    public static void main() {
        Car bmw =  new Car();
        bmw.setBrand("BMW");
        bmw.setModel("M6");
        System.out.println(bmw);

        Car bmw2 = new Car();
        System.out.println(bmw.hashCode());
        System.out.println(bmw2.hashCode());

        System.out.println(bmw2);

//        Car mercedes =  new Car();
//        mercedes.setBrand("Mercedes");
//        mercedes.setModel("AMG");
//        System.out.println(mercedes.getBrand());
//        System.out.println(mercedes.getModel());
    }
}
