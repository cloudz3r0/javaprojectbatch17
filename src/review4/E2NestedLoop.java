package review4;

public class E2NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {//for every loop in this outer loop there'll be 3 loops for each one. run if confused
            //loop will stop after printing these loop 5 times.
            System.out.println("Hello");
            //  } makes them independentLoops but these are nested without it
            for (int j = 0; j < 3; j++) {
                System.out.println("Happy Birthday");

            }
        }
    }
}
