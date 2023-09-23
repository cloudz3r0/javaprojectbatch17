package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class T1RemoveDup {
    public static void main(String[] args) {

        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        LinkedHashSet<String>bList=new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(bList);
        System.out.println(aList);
    }
}
