package class12;

public class E2MethodsTester {
    public static void main(String[] args) {
        E2Methods e2=new E2Methods();
        int sum=e2.add(10,10);
        System.out.println(sum);
//to be able to store the functions output need to remove void and put datatype instead
        //check E2Methods


       int results= e2.multiply(20);//if we had void in the class we called we wouldnt be
        //able to do this
        System.out.println(results);

    }
}
