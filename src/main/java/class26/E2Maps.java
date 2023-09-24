package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap <Integer, String> students=new LinkedHashMap<>();
        students.put(1,"Adam");
        students.put(1,"Marta");
        students.put(1,"Ehab");
        students.put(1,"Ahmed");
        System.out.println(students);//now its all being overriden by each value that has the same key. Overriding the value.

    }
}
