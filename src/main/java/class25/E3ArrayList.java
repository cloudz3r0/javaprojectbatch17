package class25;

import java.util.LinkedList;
import java.util.List;

public class E3ArrayList {
    public static void main(String[] args) {
        List<Integer> v=new LinkedList<>();
           v.add(0);
            v.add(10);
            v.add(15);
            v.add(20);
            v.add(30);

        System.out.println(v);
        v.remove(2);
        System.out.println(v);
        v.remove(2);
        System.out.println(v);

        v.removeIf(x->x>15);
        System.out.println(v);
    }
}
