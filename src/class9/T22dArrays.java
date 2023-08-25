package class9;

public class T22dArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40,50},
                {15, 30, 35, 45,20},
                {16, 20, 32, 22,30}};
        //write a loop to get all elements from second row one by one
        for (int i = 0; i <=numbers.length; i++) {//cant use numbers. length since it has more than 4 values. 0, 1,2,3.
            System.out.println(numbers[1][i]);
        };
    }
}
