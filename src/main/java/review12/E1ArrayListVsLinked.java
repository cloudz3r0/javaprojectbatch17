package review12;

import java.util.ArrayList;
import java.util.LinkedList;

public class E1ArrayListVsLinked {
    public static void main(String[] args) {
        ArrayList <String>names=new ArrayList<>();
        names.add("Adrian");//0
        names.add("Cloud");//1
        names.add("Nero");//2
        names.add("Raiden");//3
        names.add("Adam");//4
        System.out.println(names);
        names.add(1,"Nelson");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        LinkedList<String> names2=new LinkedList<>();
        names.add("Adrian");
        names.add("Cloud");
        names.add("Nero");
        names.add("Raiden");
        names.add("Adam");


    }
}
