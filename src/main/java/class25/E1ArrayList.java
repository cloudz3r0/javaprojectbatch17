package class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        int []arr=new int[5];
        ArrayList<Integer> numbs=new ArrayList<>();
        numbs.add(10);
        numbs.add(25);
        numbs.add(34);
        numbs.add(20);
        System.out.println(numbs);
        numbs.remove(1);
        System.out.println(numbs);

    }
}
