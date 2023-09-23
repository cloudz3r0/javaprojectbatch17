package review5;

public class array2DTimesTwo {
    public static void main(String[] args) {


        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(2 * a[i][j] + " ");
            }
            System.out.println();
        }
        //Double and print array
    }
}


/*
or you can do this.

		double[][] a = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
		  for(double[]row:a){
        for(double n:row){
          System.out.print(2*n+" ");
        }
          System.out.println();
      }
		//Double and print array
 */
