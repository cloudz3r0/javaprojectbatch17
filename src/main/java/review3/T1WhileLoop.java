package review3;

public class T1WhileLoop {
    public static void main(String[] args) {
        //print 62 63 66 67 68 69 70

        int start = 62;
        int end = 70;
        while (start <= end) {
            if (start != 64 && start != 65) {
                System.out.print(start + " ");
            }//must put this before the step. It will only print up to 63. so 62 63
            start++;

        }
    }
}

    //print 62 63 66 67 68 69 70

