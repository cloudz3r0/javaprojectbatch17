package class24;

import java.util.ArrayList;

public class Task5 {/*Create an arrayList of even numbers from 1 to 500. Remove
any number divisible by 5
*/

    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 2; i <=500 ; i+=2) {
            nums.add(i);
        }
        System.out.println(nums);
        for (int i = 2; i < nums.size(); i+=2) {
            if(nums.get(i)%5==0){
                nums.remove(i);
            }
        }
        System.out.println(nums);
   nums.removeIf(x->x%5==0);
        System.out.println(nums);



    }

}
