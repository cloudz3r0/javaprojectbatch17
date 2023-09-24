package class26;

import java.util.LinkedHashMap;

public class T1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and its associated company name.
        insert 7 entries with duplicate keys and values
         */
        LinkedHashMap<Integer,String>floors=new LinkedHashMap<>();
        floors.put(1,"Google");
        floors.put(2,"Syntax");
        floors.put(3,"Amazon");
        floors.put(4,"Microsoft");
        floors.put(3,"Mcdonalds");
        floors.put(4,"Apple");
        floors.put(7,"Safari");
        System.out.println(floors);
        System.out.println("========");
        System.out.println("Company size: "+floors.size());
        System.out.println("=========");
        System.out.println("Company replaced:"+floors.replace(4,"Starbucks"));
        System.out.println(floors);
        System.out.println("========");
        System.out.println("Company removed "+floors.remove(7));
        System.out.println("Updated building "+floors);
    }
}
