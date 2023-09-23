package class15;

public class Test {
    Test (){
        System.out.println("1");
    }
    Test(String name){
        System.out.println("2");
    }
      Test(int age){
          System.out.println("3");
      }
      Test(String name, int Age){
          System.out.println("4");
      }

    public static void main(String[] args) {
        Test t=new Test("Hello",25);
    }
}
