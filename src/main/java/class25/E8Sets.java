package class25;

import java.util.HashSet;

public class E8Sets {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
        //No duplicates and no insertion order
        fruit.forEach(x-> System.out.println(x));
        for(String f:fruit){
            System.out.println(f);
        }
    }
}
