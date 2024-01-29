package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Hw4 {/*
Create the collection that will store single uniques
Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
*/

    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Hi");
        str.add("Hello");
        str.add("Hellothere");
        str.add("Mynameis");
        str.add("Jeff");
        LinkedHashSet<String> str2=new LinkedHashSet<>(str);

       String con=String.join( "", str2);
        System.out.println(con);
        }
    }

