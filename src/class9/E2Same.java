package class9;

public class E2Same {
    public static void main(String[] args) {

        String [][] names =//       0       1       2       3
                {              {"Adrian", "Ava", "Nero", "Cloud"},           //array 0
                               {"Winnie", "Nala", "Cooper", "Raiden"},           //array 1
                               {"Father", "Mother", "Son", "Daughter"},           //array 2
                               {"Hi", "Hello", "Bye", "Goodbye"}      //array 3

                };
        System.out.println(names[0][1]);//Ava
        System.out.println(names[3][2]);//Bye
    }
}
