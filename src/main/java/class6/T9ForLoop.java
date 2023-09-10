package class6;

public class T9ForLoop {
    public static void main(String[] args) {
//print only odd numbers from 100 to 1 in two different loops on same line
        //start with 99 since 100 is even
       int i=99;
       while(i>=1){
           System.out.print(i+" ");
           i-=2;

       }
        for (int y = 99; y >= 1 ; y-=2) {
            System.out.print(i+" ");

        }


        }
    }

