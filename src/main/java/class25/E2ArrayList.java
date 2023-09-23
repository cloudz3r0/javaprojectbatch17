package class25;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbs=new ArrayList<>();
        numbs.add(10);
        numbs.add(25);
        numbs.add(34);
        numbs.add(20);
        numbs.forEach(x-> System.out.println(x));
        //prints for each element.
    }
}
