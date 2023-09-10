package class7;

public class E5NestedLoop {
    public static void main(String[] args) {

        int y=1;
        while(y<=3) {
            int x=1;
            while (x<=5){
                System.out.print("=");
                x++;



        }
            System.out.println();// prints the lines 3 times thanks to first loop. y++
            y++;
        }
    }
}
