package class26;

import java.util.LinkedHashMap;

public class E3Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(1, "Adam");
        students.put(2, "Marta");
        students.put(3, "Ehab");
        students.put(4, "Ahmed");
        System.out.println(students);
        students.remove(3);
        System.out.println(students);

        students.replace(2,"Jamel");
        System.out.println(students);
    }
}
