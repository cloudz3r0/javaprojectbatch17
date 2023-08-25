package class7;

public class E3NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
//both loops are independent. if one is false the other will still print.
            for (int j = 0; j < -1; j++) {
                System.out.println("+");
            }
            System.out.println("@");
        }
    }
}
