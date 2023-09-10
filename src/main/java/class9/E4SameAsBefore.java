package class9;

public class E4SameAsBefore {
    public static void main(String[] args) {
        String [][] names =//       0       1       2       3
                {              {"Adrian", "Ava", "Nero", "Cloud"},           //array 0
                        {"Winnie", "Nala", "Cooper", "Raiden"},           //array 1
                        {"Father", "Mother", "Son", "Daughter"},           //array 2
                        {"Hi", "Hello", "Bye", "Goodbye"}      //array 3

                };
        String[] row=names[1];//choosing the row/array
        System.out.println(row[2]);//selecting which value in the array
    }
}
