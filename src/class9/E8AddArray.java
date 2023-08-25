package class9;

public class E8AddArray {
    public static void main(String[] args) {
       //add all numbers in array
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};
       int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {//if we dont put [row] then it will go up to 3 elements in each row. 0 1 2
                sum=sum+numbers[row][col];// adds the numbers per row. 10+20+30+40 then so on
            }
        }
        System.out.println(sum);
    }
}
