package class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {
        //print all even numbers using enhanced for loop
        int[] nums = {10, 23, 25, 56, 45, 20};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
        System.out.println("=====");
        //Create a for loop that prints out even numbers from 2 to 14 using if condition
        //Must include the number 14 in the output
        for (int i = 2; i <= 14; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
