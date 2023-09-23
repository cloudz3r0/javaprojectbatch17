package class17;

public class A {//grandparent class
    String name;

    void printName(){
        System.out.println(name);
    }
}
class B extends A{//parent class
    String color;
    void printColor(){
        System.out.println(color);
    }
}
class C extends B{
    void printNameColor(){
        System.out.println(name+" "+color);
    }
}
class D extends B{

}