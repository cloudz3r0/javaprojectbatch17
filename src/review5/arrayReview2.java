package review5;

public class arrayReview2 {
    public static void main(String[] args) {
        double[]price={1.99,12.09,1.0,4.50};;
        //              [0]  [1]  [2]  [3]
        for(double row:price){
            System.out.println(row);
            
        }
        //regular for loop
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
            
        }
    }
}
