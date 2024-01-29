package class26;

import java.util.ArrayList;

public class Hw5 {/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
*/
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(40);
        nums.add(70);
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        System.out.println(sum);
    }
}
