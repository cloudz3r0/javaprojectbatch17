package class24;

import java.util.ArrayList;

public class Task6 {/*
Create an arrayList of fruit. Then remove all the fruit which contains the letter a
or ends with letter E.
*/

    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Tomato");
        fruits.add("BlueBerries");
        fruits.add("Grapes");
        fruits.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(fruits);
    }
}
