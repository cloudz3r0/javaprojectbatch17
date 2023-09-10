package class9;

public class E9Array2dPrintRow {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};
        for (int row = 0; row < numbers.length; row++) {//numbers.length is 2. 0,1,2.
            System.out.println(numbers[0][row]);
            //wont get 40 because the amount of rows is 3. can use <= instead
        // first square brackets pick the row. Then [row] will go through all the numbers
        }
    }// can use sout(numbers[row][1] to go through the columns. So this will go through element 1 of each row
}//sout(numbers[row][2]); . remember first loop is rows second one is columns. this will print 30 35 32
//sout (numbers [1][row]); prints second columns values. With no <= in the loop will only print 15 30 35