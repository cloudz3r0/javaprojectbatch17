package class25;

import java.util.LinkedList;
import java.util.List;

public class E4ArrayListVsLinked {
    public static void main(String[] args) {
       long startingTime=System.currentTimeMillis();

        List<Integer> numbers=new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

//if we used arraylist it would've been 15x slower than linkedlist.
long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);

    }
}
