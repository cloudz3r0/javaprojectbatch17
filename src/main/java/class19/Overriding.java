package class19;

public class Overriding {
    /*
    Create 1 clas with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and
    observe result.
     */
    public static void add(){
        System.out.println("No numbers in here");
    }
    static void add(int a,int b){
        System.out.println(1);
        System.out.println(a+b);
    }
    static void add(double a, int b){
        System.out.println(2);
        System.out.println(a+b);
    }
    static void add(int a, double b){
        System.out.println(3);
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add();
        add(1,2);
        add(10.5,9);

    }


}
