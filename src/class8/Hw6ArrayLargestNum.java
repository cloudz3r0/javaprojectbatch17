package class8;

public class Hw6ArrayLargestNum {
    public static void main(String[] args) {
        int []numbers={1,5,6,10,89};
        int largest=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largest){
               largest=numbers [i];

            }
        }
        System.out.println(largest);
    }
}
