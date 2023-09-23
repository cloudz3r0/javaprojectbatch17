package review9;

public class Calc {
    void add(int a, int b){
        System.out.println(a+b);
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int ... arr){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        return sum;
    }
}
class Calctester{
    public static void main(String[] args) {
        Calc c=new Calc();
        int result=c.add(5,7,98,6);
        System.out.println(result);
    }
}