package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Deepali");
        names.add("Adrian");
        names.add("Hi");
       // names.remove(0);
        names.remove("Deepali");//overloading helped us pass index at first but now we can also do names.
        System.out.println(names);
        names.add(0,"Ehab");//can add any element to any index we want. arraylist constantly adjusts indexes.
        System.out.println(names);
        names.set(1,"Ava");//replaces whats in the index
        System.out.println(names);

    }
    }

