package class9;

public class T72dEvenNumbers {
    public static void main(String[] args) {
//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
   int [][]numbers={
           {1,32,55,67},
           {3,45,68,70},
           {6,98,77,32}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col <numbers[row].length; col++) {

                if(numbers[row][col]%2==0){
    System.out.print(numbers[row][col]+" ");
            }

        }
   }



    }
}


