package class22;

public interface Vehicle {
    void drive();
}
interface Bike extends Vehicle{// use extends if parent and child are both interface
    //parent interface and child is class then its implements.
    //both are class then of course extends.
    void applyBreaks();
}
class HondaBike implements Bike{

    @Override
    public void drive() {
        System.out.println("driving.....");
    }

    @Override
    public void applyBreaks() {
        System.out.println("stop....");
    }
}
