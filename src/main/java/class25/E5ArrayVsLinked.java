package class25;

import java.util.LinkedList;
import java.util.List;

public class E5ArrayVsLinked {
    public static void main(String[] args) {
        long startingTime=System.currentTimeMillis();

        List<Integer> numbers=new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(numbers.get(100000));//in this case array is faster since its trying to use the get method
            //would've taken a lot longer with linkedList if we wanted to get a element.
        }

//if we used arraylist it would've been 15x slower than linkedlist.
        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);
    }
}
