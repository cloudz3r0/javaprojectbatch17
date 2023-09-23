package class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList <String> cars=new ArrayList<>();
        cars.add("Nissan");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Audi");
        System.out.println(cars);
        for (String n:cars){
            System.out.println(n);

        }
        System.out.println("================");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
