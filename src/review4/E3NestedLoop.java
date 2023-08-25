package review4;

public class E3NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = i; j <= 3; j++) {//once i becomes 3 the loop ends.
                //once first loop runs then i becomes one. So now 0 wont print and 1 will as the starting point
                System.out.println(i+" "+j);

            }

        }
    }
}
