package class25;

import java.util.LinkedHashSet;

public class T4Cities {
    /*
    Create a set of cities in which you want to make sure that insertion
    order is maintained. Then remove any city that starts with A
     */
    public static void main(String[] args) {
        LinkedHashSet<String> c=new LinkedHashSet<>();
        c.add("Rockville");
        c.add("Bethesda");
        c.add("Annapolis");
        c.add("Annandale");
        c.add("Gaithersburg");
        c.add("Germantown");
        System.out.println(c);
        c.removeIf(x-> x.startsWith("A"));
        System.out.println(c);
    }
}
