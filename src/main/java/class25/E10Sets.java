package class25;

import java.util.TreeSet;

public class E10Sets {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        System.out.println(numbers);
    }
}
