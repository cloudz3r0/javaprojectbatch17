package class7;

public class E7NestedLoop {
    public static void main(String[] args) {
       /*
       print
       0 0 0 (so the value started with 0. So i's value goes into j's loop so we start w 0<3 then 1<3 then 2<3.)
       1 1 (then 1 is the starting value for j. So it goes 1<3 then 2<3. Then it goes to 3<3 and thats false so no more print)
       2 (then we start with 2<3. Then it goes to 3<3 and its false so no more print)
        */

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
