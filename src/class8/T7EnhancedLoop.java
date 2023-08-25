package class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {
        //go through the array and replace all the negative numbers with 0
      //iter to make enhanced for loop
        int[]nums={10,77,25,56,60,20,-10,-5};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){//if number is less than 0
                nums[i]=0;//replaces number with 0
        }
        }
        for (int num : nums) {//use next loop to print all the numbers with updated values.Can use the first loop
            //using sout(i);
            System.out.println(num);
        }
    }
}
