package class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        names.add("Adrian");
        names.add("Steven");
        names.add("Nero");
        names.add("Cloud");
        names.add("Raiden");
        System.out.println( names.isEmpty());
        System.out.println(names.contains("Adrian"));
        System.out.println(names.size());
        System.out.println(names);
      }
    }

