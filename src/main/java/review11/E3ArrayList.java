package review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ali");//0
        names.add("Arthur");//1
        names.add("Jamel");//2
        names.add("Adrian");//3
        names.add("Jamel");
        System.out.println(names.size());
        System.out.println( names.get(2));
        System.out.println(names.remove(1));//can remove by values but its best to remove by index.need to print out the array again after removal
        System.out.println(names.contains("Adrian"));
        System.out.println("===========");
        System.out.println(names);
        System.out.println("===========");
        names.removeIf(x->x.equals("Jamel"));//if u want to remove anything that contains a certain letter then use contains in this expression.
        System.out.println(names);
    }
}
