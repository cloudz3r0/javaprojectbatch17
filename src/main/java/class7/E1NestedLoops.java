package class7;

public class E1NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.print("+");
        }
        System.out.println();//need to put these before the next loop
        for (int i = 0; i < 5; i++) {
            System.out.print("+");

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("+");

        }
    }
}
