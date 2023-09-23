package review4;

public class E12NestedReverseTriangle {
    /*
    write a nested loop to write this triangle
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
     */
    public static void main(String[] args) {


        for (int index = 7; index >= 1; index--) {//creates 7 rows. would be 8 if we used 0
            for (int j = 1; j <= index; j++) {//creates the columns value. starts at 1
                //then goes by whatever is in index
                //so if 6 is index then that row will go up to 6.
                //the outer loop decrements so its first value will be 7 then goes down.

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
