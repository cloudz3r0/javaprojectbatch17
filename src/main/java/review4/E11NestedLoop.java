package review4;

public class E11NestedLoop {
    /*
    Write a program to print out the pattern:



 1 2 3 4 5
 1 2 3 4 5
     */
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");//we use j to print the elements in each row.
            }
            System.out.println();//make new line for row
        }
    }
}
