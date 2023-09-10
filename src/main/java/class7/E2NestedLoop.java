package class7;

public class E2NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("+");//this print is inside the for loop and the one on top
                //will also use it but its in the second loops bracket

            }
            System.out.println();//need to put this after a loop like these
        }
    }
}
