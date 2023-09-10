package class7;

public class E11SecondArray {
    public static void main(String[] args) {
        int [] prices=new int[5];//specify the size of the array
        prices[0]=1000;
       prices[2]=250;
       prices[2]=234;//this overrides the first two and changes its value
        System.out.println(prices[2]);

    }
}
