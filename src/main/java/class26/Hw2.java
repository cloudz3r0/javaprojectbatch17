package class26;

import java.util.TreeMap;

public class Hw2 {/*
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.

*/

    public static void main(String[] args) {
        TreeMap<Integer,String>person=new TreeMap<>();
person.put(1,"Adrian");
person.put(2,"James");
person.put(3,"John");
person.put(4,"Jon");
        System.out.println(person);
        System.out.println("============");
        var entries=person.entrySet();
        for(var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
