package class16;

public class T1 {
    /*
    create 4 different constructors that have different access levels. One allowed in its own package(private) one
    in a different class but same package(static) and one in a different package(public)

     */





    private T1(){
        System.out.println("Private");
    }
    T1(String name){
        System.out.println("Default");
    }
    protected T1(int age){
        System.out.println("Protected");
    }
    public T1(double weight){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new T1();//calls private class since it has no parameters.
new T1("Hello");//calls default since it has a string
        new T1(45);
        new T1(4.0);

    }
}
