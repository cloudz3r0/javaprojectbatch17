package class19;

public class Minimum {
   /*
   Create a method to find the minimum of two numbers.
   Two different mthods with whole and decimal numbers.
   Return the minimum number
    */


    public int min(int a, int b){
        if(a>b){
           return b;
        }else{
            return a;
        }
    }
    public double min(double c,double d){
        if(c>d){
            return d;
        }else{
            return c;
        }
    }
}
