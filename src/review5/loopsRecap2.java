package review5;

public class loopsRecap2 {
    public static void main(String[] args) {
        System.out.println("Nested Loop");
        for (int i = 1; i < 3; i++) {
            System.out.println(i);
            for (int j = 1; j <= 4; j++) {
                System.out.println("Bye");
                break;
            }


        }

    }
}
