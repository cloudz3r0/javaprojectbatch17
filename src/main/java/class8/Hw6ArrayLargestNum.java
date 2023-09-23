package class8;

public class Hw6ArrayLargestNum {
    public static void main(String[] args) {
        int []numbers={1,5,6,10,89};
        int largest=numbers[0];//first number of array gets stored into largest
        for (int i = 0; i < numbers.length; i++) {//loop to go through the array
            if (numbers[i]>largest){//first number will be the same as largest. Condition will
                //be false so largest gets stored into numbers[i]
                //keeps going until the condition is true
               largest=numbers [i];//then numbers[i] will convert back into largest

            }
        }
        System.out.println(largest);//then printed here outside of loop.
    }
}
