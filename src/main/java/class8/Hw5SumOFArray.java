package class8;

public class Hw5SumOFArray {
    public static void main(String[] args) {
        //Create an array on integers and calculate the sum of all elements in an array
        int[] numbers = {2, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        System.out.println(sum);//needs to be out of the loop
    }
}