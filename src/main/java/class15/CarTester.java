package class15;

public class CarTester {
    public static void main(String[] args) {
        Car c1=new Car("Toyota","Camry","Black",35000);
        //calls constructor
    c1.printInfo();
    c1.setPrice(30000);//sets a new price.
    c1.printInfo();
        System.out.println(c1.getPrice());//prints out the new stored price.
    }
}
