package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList();
        arr.add("Hello");
        arr.add("Hi");
        arr.add("Bye");
        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Hello"));
        System.out.println(arr.indexOf("Bye"));
    }
}
