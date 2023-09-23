package class12;

public class T2Tester {
    public static void main(String[] args) {
        T2Methods t2=new T2Methods();
      int res=  t2.larger(10,20);
        System.out.println(res);
        System.out.println( t2.larger(10,20));
//if we used void then we'd just put the parameters and it would print what we had in the method



      String email=t2.createEmail("Adrian","Franco","gmail");
        System.out.println("Your email is "+email);


    }
}
