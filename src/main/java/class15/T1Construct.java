package class15;

public class T1Construct {
    /*
    Write a class with a constructor.
    One with parameters and one with none
    Execute both in a separate class
     */


    private String name;
  private   int age;
    public T1Construct(String dName){
        name=dName;
        System.out.println("Parameter is "+name);
    }
   public T1Construct(){
        System.out.println("No parameters");
    }
    void printInfo(){
        System.out.println(name);
    }
}
