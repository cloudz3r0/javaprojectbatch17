package class6;

public class E8WhileDecrement {
    public static void main(String[] args) {
        int i=10;
        while(i>=1) {
//decrements are used to print the reverse order
          System.out.println(i);//if I put 1--; above print it will print 9,8,7,6,5,4,3,2,1,0
            i--;
            /*
            can do
            i--;
            i--;
            i-=2;
            i=i-2;
            to do even numbers print
             */
        }
    }
}
