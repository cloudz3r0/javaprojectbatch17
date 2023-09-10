package class6;

public class T2LoopEvenNumbers {
    public static void main(String[] args) {
        //print 10 12 14 16 18 20
        int i=10;
        while(i<=20){//will print by 2 up to 20 because it will be false after 20
            System.out.println(i);
          i+=2;//adds it by two
            /*Can use
            i++;
            i++;
            i+=2
            i=i+2
             */
        }
    }
}
