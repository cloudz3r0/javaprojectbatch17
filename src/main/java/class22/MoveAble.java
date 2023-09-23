package class22;

public interface MoveAble {
    //all these classes aren't closely related but have something in common.
    //with abstraction, it was for classes that have a few similar methods.
//how
    //not possible to have instance fields.
    //constructors as well.
    //or methods with a body same with abstract.

    //by default everything is abstract public static final

    void move();//by default the classes are abstract.
    void method1();
}
interface WashAble{//now with interface we can use two different parent classes?
    void wash();//if these were implemented with  different pieces of code we cant use them.
    void method1();
}
class Dog implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Dogs can jump run and can move");
    }

    @Override
    public void method1() {
        System.out.println("I care where its coming");
    }

    @Override
    public void wash() {
        System.out.println("Pain to wash dog that hates water");
    }
}
class Car implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Car can move forward or backwards and can go in circles.");
    }

    @Override
    public void method1() {
        System.out.println("I dont care where it is coming");
    }

    @Override
    public void wash() {
        System.out.println("Easy to wash car since it doesnt move.");
    }
}
