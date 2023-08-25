package class6;

public class E9WhileLoopScanner {
    public static void main(String[] args) {
             /*int start=1;
            while(start<=10){
             System.out.println(start);
                   i++;
this will be the same as the bottom one
the bottom is just introducing variables instead of numbers*/
        int start=1;
       int end=10;
       int step=1;
        while(start<=end){
            System.out.println(start);
            start+=step;
        }
    }
}
