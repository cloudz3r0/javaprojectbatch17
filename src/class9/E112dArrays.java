package class9;

public class E112dArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};
//enhanced nested for loop.
        for(int [] row:numbers){//will loop all elements in 0 row.

            for(int col:row){//will loop all rows elements with the outer loop.

                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}


