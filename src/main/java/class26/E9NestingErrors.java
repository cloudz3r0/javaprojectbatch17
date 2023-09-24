package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class E9NestingErrors {
    public static void main(String[] args) {
        LinkedList<ArrayList<Integer>> test=new LinkedList<>();
//test.add(20); the linked list is expecting a Integer ArrayList.
        ArrayList<String> names=new ArrayList<>();
        names.add("Adrian");

        LinkedList<Integer> numbers=new LinkedList<>();
        //test.add(numbers) we're trying to store a linked list into the list at the top
        //but it doesnt work since it still expects an ArrayList not a linked List

        Map<String,Integer> map=new HashMap<>();
        //test.add(map) once again now we're trying to store a Integer map when it wants
        //an integer arraylist
        ArrayList<Integer> n=new ArrayList<>();
        test.add(n);//now we finally nested the right list into the LinkedList above.
    }
}
