package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class E10SimilarToE9 {
    public static void main(String[] args) {
        Set<String> s=new LinkedHashSet<>();
        //<String> means we will be storing the object of the String class in this set.
        Integer i=new Integer(10);//this object gets stored into i.
        String name=new String("Titu");
        s.add(name);// storing the objects value above into the String Set

        Set<ArrayList<String>> test=new LinkedHashSet<>();

        String name2="James";
        // test.add(name2);
        ArrayList<Integer> numbers=new ArrayList<>();
        Integer g=10;
        //test.add(numbers)
        ArrayList<String> j=new ArrayList<>();
        test.add(j);//now we can store into test bc it wants a ArrayList of strings.
    }
}
