package class9;

public class E7Array2dLoop {
    public static void main(String[] args) {
        int [][] numbers={
                //can put the variable names instead of putting the arrays
                {10,20,30,40},
                {100,200,303,400},
                {1,2,3,4}};

        for (int row = 0; row < 3; row++) {//prints rows in order
            for (int col = 0; col < 4; col++) {//prints values in order
                System.out.print(numbers[row][col]+" ");//prints all in order
            }
            System.out.println();//creates a new line per row
        }
    }
}
