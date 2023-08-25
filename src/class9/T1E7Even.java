package class9;

public class T1E7Even {
    public static void main(String[] args) {
        //print even numbers
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {//this gives us the complete 1d array without counting
                if (numbers[row][col]% 2==0) {// if the number is divisible by 2 then print.
                    System.out.print(numbers[row][col] + " ");
                    //can use if(numbers[row][col]%2 !=0 to print all odd numbers.
                }
                System.out.println();
            }
        }
    }
}
