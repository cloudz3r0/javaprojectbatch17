package class9;

public class T62dAddArrays {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.
        int[] []numbers={
                {1,4,5},
                {2,7,6},
                {10,8,9}
        };
        int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];
            }
        }
        System.out.println(sum);
        }
    }

