package class7;

public class E6NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            //this statement will use its first value 0, and run it through 3 times since the inner
            //loop wants to run 3 times. Then value will be 1 and print 3 times. Then 2 3 times.
            //the outer loops value changes after going through inner loops process
            for (int j = 0; j < 3; j++) {
                System.out.print(i+" ");/*
                print i will print
                0 0 0
                1 1 1
                2 2 2
             printing j
          0 1 2
          0 1 2
          0 1 2

              */

            }
            System.out.println();
        }
    }
}
