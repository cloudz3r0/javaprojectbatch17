package class7;

public class E4NestedLoop {
    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {//prints 3 lines
            for (int i = 2; i < 20; i+=2) {//prints all even numbers 2-20
                System.out.print(i + " ");// prints left to right
            }
            System.out.println();//use this to make separate lines
        }
    }
}
