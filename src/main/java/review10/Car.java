package review10;

public class Car implements WashAble {
    public void drive(){
        System.out.println("driving......");
    }

    @Override
    public void wash() {
        System.out.println("Use carwash");
    }
}
class Horse implements WashAble{

    @Override
    public void wash() {
        System.out.println("Use tub");
    }
}