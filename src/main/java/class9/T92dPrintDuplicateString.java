package class9;

public class T92dPrintDuplicateString {
    public static void main(String[] args) {
        /*
         Write a program to print out duplicate elements from an Array of
Strings?
*/
        String []arr={"Hello","Hi","My","Hello","Hi","Help","Help"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

