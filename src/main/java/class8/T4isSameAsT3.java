package class8;

public class T4isSameAsT3 {
    public static void main(String[] args) {
        // find the largest number in array
        int[] nums = {-10, -23, -25, -56, -45, -20};
        int largest=nums[0];
        for(int n:nums){

            if(n>largest){
                largest=n;
            }
        }
        System.out.println(largest);
    }
    }

