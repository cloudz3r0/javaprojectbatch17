package class9;

import java.util.Arrays;

public class E3Arrays {
    public static void main(String[] args) {
        String [][] names =//       0       1       2       3
                {              {"Adrian", "Ava", "Nero", "Cloud"},           //array 0
                        {"Winnie", "Nala", "Cooper", "Raiden"},           //array 1
                        {"Father", "Mother", "Son", "Daughter"},           //array 2
                        {"Hi", "Hello", "Bye", "Goodbye"}      //array 3

                };
        String[] firstRow=names[0];//firstRow will include the row 0's values
        System.out.println(Arrays.toString(firstRow));
    }
}
