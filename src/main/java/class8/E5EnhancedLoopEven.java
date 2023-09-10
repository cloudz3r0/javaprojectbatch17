package class8;

public class E5EnhancedLoopEven {
    public static void main(String[] args) {
      //print even numbers one by one

        int[] nums = {10, 23, 25, 56, 45, 20};
    for(int n:nums){//creates the loop for array to check then one by one with if condition.
        if(n%2==0){//if the values in n are even they can be printed
            System.out.println(n);
        }
        }

    }
}
