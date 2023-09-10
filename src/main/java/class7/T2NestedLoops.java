package class7;

public class T2NestedLoops {
    /*
    1 2 4 5 6
    1 2 4 5 6
    1 2 4 5 6
    1 2 4 5 6
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

                for (int j = 1; j <= 6; j++) {
                   if(j!=3){//when using an if must put the if's ending bracket on the print
                       //can also remove curly brackets since the if is inside the loops code
                    System.out.print(j+ " ");}


                }
                System.out.println();

            }
        }
    }

