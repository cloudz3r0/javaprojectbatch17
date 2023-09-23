package review5;

public class Print2DArrayEnhanced {
    public static void main(String[] args) {
        double [][]arr={
                {1.4,2.0 ,3.3 ,2.0 },
                {4.0 ,1.5, 6.1, 1.0 },
                {1.2 ,3.1 ,4.0 ,1.6 }};
        for(double[]row:arr){//row represents each row of 2d array
            for(double n:row){//n represents each element in each row
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}

