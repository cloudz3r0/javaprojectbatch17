package class9;

import java.util.Arrays;

public class E6PrintSingularValue {
    public static void main(String[] args) {
        int [] row0={10,20,30,40};
        int [] row1={100,200,303,};
        int [] row2={1,2,3,4};


        int [][] numbers={
                //can put the variable names instead of putting the arrays
                {10,20,30,40},
                 {100,200,303},
                  {1,2,3,4}};//the second curly bracket saves all values into numbers
        int []row=numbers[0];//this will give use the complete array
        int number=numbers[0][1];//this will give us one single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1]));//print out second row or technically row 1. A diff way of printing the row
        }
    }

