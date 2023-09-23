package class9;

public class E10ReverseArray {
    public static void main(String[] args) {
        int nums[] = { 12, 15, 16, 17, 19 };

        for (int i = nums.length-1; i >=0; i--) {//- 1 is needed because theres 5 numbers
            // but the array holds 4 indexes. 0,1,2,3,4

            System.out.println(nums[i]);

        }

    }

}


