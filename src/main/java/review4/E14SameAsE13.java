package review4;

public class E14SameAsE13 {
    public static void main(String[] args) {
        // Create an array of integers of size 11
        int[] arr = new int[11];

        // Use a single loop to fill the array and print the values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2010 + i;//now instead we just manually put that each iteration is 2010 plus
            //its increment
            System.out.println(arr[i]);
        }
    }
}
