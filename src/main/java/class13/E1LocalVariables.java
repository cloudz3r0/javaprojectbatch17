package class13;

public class E1LocalVariables {
   String country="Usa";

    public static void main(String[] args) {
       String name="Java";


       if(10>5){
            int age=23;
            System.out.println(name);//Local variables
           System.out.println(age);
        }
        // System.out.println(age); age is in the if condition so it cant be accessed outside of it.
        System.out.println(name);
    }
    int salary=120000;
}
