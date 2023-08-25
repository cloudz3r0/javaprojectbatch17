package class8;

public class E8BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("outer loop");
            for (int j = 0; j < 5; j++) {//when j's value is 2 it will print outer loop.

                if(j==2){
                    break;//only affects inner loop
                }
                System.out.println("Inner Loop");
            }
        }
    }
}
