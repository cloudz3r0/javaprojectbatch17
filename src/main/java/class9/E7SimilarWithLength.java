package class9;

public class E7SimilarWithLength {
    public static void main(String[] args) {
        int[][] numbers = {
                //can put the variable names instead of putting the arrays
                {10, 20, 30, 40},
                {100, 200, 303, 400},
                {1, 2, 3, 4}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {//this gives us the complete 2d array
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
