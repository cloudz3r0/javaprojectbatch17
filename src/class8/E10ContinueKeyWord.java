package class8;

public class E10ContinueKeyWord {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println("Batch 17 is greatest of all time");

            if(i%2==0){
                continue;//will ignore everything after it and keep going back to the first condition/loop
           //
            }
            System.out.println("I was kidding");
        }
    }
}
