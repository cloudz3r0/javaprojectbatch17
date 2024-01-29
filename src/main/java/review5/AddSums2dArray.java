package review5;

public class AddSums2dArray {
    public static void main(String[] args) {
        int [] [] arr ={

                {10,30,40,20}, // 100

                {10,50,40,30}, // 130

                {20,50,40,30} // 140
        };

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
               sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
