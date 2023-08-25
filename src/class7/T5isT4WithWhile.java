package class7;

public class T5isT4WithWhile {
    public static void main(String[] args) {
      /*
      print
      1 1
      1 2
      1 3
      2 1
      2 2
      2 3
      3 1
      3 2
      3 3
       */

        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println(i +" "+ j);
                j++;
            }
            i++;
        }
    }
}
