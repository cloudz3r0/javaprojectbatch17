package class22;

public class BikeTester {
    public static void main(String[] args) {
        HondaBike h= new HondaBike();//Grandchild class can create its own object
             Bike b=new HondaBike();//Parent can create an object of child
             Vehicle s=new HondaBike();//Grandparent creating an object of grandchild
        //any parent is capable of storing all of child class objects.
        b.applyBreaks();
        b.drive();
        h.applyBreaks();
        h.drive();
        s.drive();//grandparent class doesnt have the applybreaks method.

    }
}
