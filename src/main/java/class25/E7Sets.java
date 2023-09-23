package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E7Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
       //We can stro duplicates in ArrayList or Linked List
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer>uniqueNumbers=new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);

        System.out.println(uniqueNumbers);
    }
}
