package class7;

public class E8NestedLoopTriangle {
    public static void main(String[] args) {
        /*print
        *
        **
        ***
        ****
        *****
        ******
        */
        for (int i =0; i <=5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
//since earlier we did in j=i. now we change it and put j<=i to do it the reverse way.
                //so for the reverse order we'd do for(int j=i;j<=5;j++
            }
            System.out.println();
        }


    }
}
