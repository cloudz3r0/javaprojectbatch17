package class7;

public class T4NestedLoops {
    public static void main(String[] args) {
        /*print
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3
        3 1
        3 2
        3 3
         */
        for (int i = 1; i <= 3; i++) {
            /*
            i's loop is
            1
            1
            1
            2
            2
            2
            3
            3
            3
           since its outer loop, its steps are the inner loops prompt.
           so inner loop says <=3 so the outer loop will print its value 3 times before it changes it
             */
            for (int j = 1; j <= 3; j++) {
                System.out.println(i+" "+j);
                /*
                j's loop is
                1
                2
                3
                1
                2
                3
                1
                2
                3
                since its the loop that changes the value each step unlike the outer loop
                 */
            }
        }




    }

}
