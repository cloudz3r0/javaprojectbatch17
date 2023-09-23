package class6;

public class E15DoWhile {
    public static void main(String[] args) {
        int k=3, tot=0;

        do{

            tot=tot+k;//tot will be 3 after 0+3. Then gets looped 11 times to 52.

            k++;

        } while(k<11);

        System.out.print(tot);
    }
}
