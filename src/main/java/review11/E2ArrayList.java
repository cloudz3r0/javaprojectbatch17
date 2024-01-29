package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[1] = 10;
        numbers[2] = 5;
        numbers[3] = 15;
        System.out.println(numbers);

        ArrayList<Integer> nums = new ArrayList<>(10000);//can declare its size ahead of time. S
        //internally the arraylist has a size of 10. If you add more a reconstruction happens. Goes by 10 each time u do more than 10,20,30.
        nums.add(10);
        nums.add(20);
        nums.add(45);
        nums.add(50);
        System.out.println(nums);

        nums.remove(new Integer(45));//So what we did at the bottom. No overloaded method so we have to remove it
        //by creating its object. Only need to do this for Integers.
        System.out.println(nums);


        ArrayList <String>names=new ArrayList<>();
        names.add("Jamel");
        names.add("Arthur");
        names.add("Adrian");
        names.remove(1);
        names.remove(names);//theres an overloaded method for String class for removing an object.
        names.remove("Jamel");
    }
}
