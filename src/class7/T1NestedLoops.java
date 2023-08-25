package class7;

public class T1NestedLoops {
    public static void main(String[] args) {
        /*
        print
      1 2 3 4 5 6
      1 2 3 4 5 6
      1 2 3 4 5 6
      1 2 3 4 5 6
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print(j+" ");


            }
            System.out.println();

        }
    }
}
