package class9;

public class E5Array2dLoops {
    public static void main(String[] args) {
        String [][] names =//       0       1       2       3
                {              {"Adrian", "Ava", "Nero", "Cloud"},           //array 0
                        {"Winnie", "Nala", "Cooper", "Raiden"},           //array 1
                        {"Father", "Mother", "Son", "Daughter"},           //array 2
                        {"Hi", "Hello", "Bye", "Goodbye"}      //array 3

                };
        String []row=names[2];//selects the third row/array
        for (String name:row){
            System.out.println(name);
        }
    }
}
