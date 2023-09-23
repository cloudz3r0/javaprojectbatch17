package review5;

public class TwoDArrayAllSums {


        public static void main(String[] args){
            int[][] a = {
                    {1,1,2}, //sum = 4
                    {3,1,2}, //sum = 6
                    {3,5,3}, //sum = 11
                    {0,1,2}  //sum = 3
            };
            int[] rowSums=new int[a.length];//create array to store all values in.
            for (int i = 0; i < a.length; i++) {//go through rows
                int sum=0;
                for (int j = 0; j < a[i].length; j++) {//goes through columns. dont need [i] if indexes
                    //of rows and columns are the same.
                    sum=sum+a[i][j];//will give sum of all rows
                }
                rowSums[i]=sum;//gives sum of each row instead.
            }
            for (int i = 0; i < rowSums.length; i++) {//create array print statement.
                System.out.println(rowSums[i]);
            }
        }
    }

