package class8;

public class T8SmallAndLarge {
    public static void main(String[] args) {

        int[] arr = {10, 50, 60, 80, 70};
        int largest = arr[0];

        for (int n : arr) {
            if (n > largest) {
                largest = n;
            }

        }
        System.out.println(largest);
        int smallest = arr[0];
        for (int s : arr) {
            if (s < smallest) {
                smallest = s;

            }

        }
        System.out.println(smallest);
    }
}



