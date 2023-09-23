package class25;

import java.util.TreeSet;

public class T3Names {/*
Create a set in which you need to add names of countries and sort it in alphabetical order
Using 2 different ways retrieve all elements of set
*/
    public static void main(String[] args) {
        TreeSet <String> v=new TreeSet<>();
        v.add("Usa");
        v.add("Africa");
        v.add("Mexico");
        v.add("Colombia");
        v.add("Armenia");
        v.add("Japan");
        v.add("China");
        v.add("Korea");
        System.out.println(v);
        v.forEach(x-> System.out.println(x));
    }
}
