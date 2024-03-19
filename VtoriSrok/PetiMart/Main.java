package VtoriSrok.PetiMart;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Map<String, Integer>>> mymap = new HashMap<>();
        mymap.put("123", new HashMap<>());
        mymap.get("123").put("456",new HashMap<>());
        mymap.get("123").get("456").put("789",1000);

        System.out.println(mymap.get("123").get("456").get("789"));


        Map<String, String> carPlates = new HashMap<>();
        carPlates.put("PH23432424","BMW");
        carPlates.put("PH23432444","Opel");
        carPlates.put("PH23432824","Mer");
        carPlates.put("PH23432024","Audi");

        carPlates.putIfAbsent("PH23432424", "Hel");

        System.out.printf(carPlates.get("PH23432424"));
        Set<String> keys = carPlates.keySet();
        for (String key: keys) {
            System.out.println(key + " - " + carPlates.get(key));
        }

        for (String val : carPlates.values()) {
            System.out.println(val);
        }

        for (Map.Entry<String,String> entry : carPlates.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
