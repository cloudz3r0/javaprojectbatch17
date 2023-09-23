package class14;

public class T2ArraySumMethod {
    /*Create a method  that will accept an array as parameters and will return a sum of all elements
    from that array. Method should only be visible within same package
    and be accessible by creating an instance/object of the class.
     */
    int getArrSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum = sum + n;
        }
        return sum;
    }
}
