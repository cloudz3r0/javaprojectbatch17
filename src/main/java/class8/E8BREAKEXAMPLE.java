package class8;

public class E8BREAKEXAMPLE {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("outer loop");
            for (int j = 0; j < 5; j++) {//when j's value is 2 it will print outer loop.

                if(j==2){
                    break;//only affects inner loop stops loop once condition is met.
                    //stops innerloop from printing more than 2 lines.
                    //without break thered be 5 lines of innerloop.
                    //affects loop break is in.

                }
                System.out.println("Inner Loop");
            }
        }
    }
}
