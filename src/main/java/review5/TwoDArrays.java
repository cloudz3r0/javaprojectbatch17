package review5;

public class TwoDArrays {
    public static void main(String[] args) {
        //one way to create 2d array

        int [] []array=new int[2][4];
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;

        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;
        System.out.println(array[0][3]);//manually take out 15.
        //array.length in 2d array returns number of rows
        //array[row].length in 2d array returns number of column from that row.
        //how to get all elements from 2d array
        for(int row=0;row<array.length; row++){//arrays.length is 2. prints rows 0 and 1
            //outer loop iterates over rows
            for (int col = 0; col <array[row].length ; col++) {//arrays[row].length is the length of each row. will give 4
                //inner loop iterates over columns
                System.out.println(array[row][col]);//prints the columns of each row.
                /*
                0 0 12
                0 1 13
                0 2 14
                0 3 15

                1 0 1
                1 1 2
                1 2 3
                1 3 4
                 */
            }
        }

    }
}
