package review5;

public class arrayReview {
    public static void main(String[] args) {
        int a = 10;
        int[] nums = {10, 30, 50, 80, 90};
        int numOfElements = nums.length;
        System.out.println(numOfElements);
        System.out.println(nums[4]);//print the 5th number in array. this array is 0,1,2,3,4.
        /*
        when to use loops-when we want to repeat a Block of code
       when we do not know the exact number of iterations.- while or do while
         when we know how many times we want to repeat or iterate code- for loop
        */
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");//important to add [i] to print the values in the array.

        }

        System.out.println();
        System.out.println("=========");
/*
         enhanced for loop syntax
         for(dataTypeOfelements anyVariableNameYouWantForRow:nameOfArray
 */
        //int []nums={10, 30, 50, 80, 90};
        for (int row:nums){//the row becomes whatever number is in array. 10 then checks if there's another one.
            //there is so 30 becomes row then 50 then 80 then 90. Loop finishes because there's no next number
            System.out.print(row+" ");
        }


    }
}
