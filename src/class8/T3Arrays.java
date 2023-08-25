package class8;

public class T3Arrays {
    public static void main(String[] args) {

        // find the largest number in array
        int[] nums = {10, 23, 25, 56, 45, 20};
     int largest=nums[0];//should always do this instead of putting 0. Can try either or but this is recommended
       for(int n:nums){

           if(n>largest){//largest becomes 10 then checks the next number. 23>10 is tru so
               largest=n;//23 replaces 10 in the largest variable then the next number comes up
               //25>23.then becomes 56>25 is true so 56 becomes new largest.
               // 45>56 is false so 56 stays. then 20>56 is also false. Now we have our largest number
            }
        }
        System.out.println(largest);
   }

}