package class18;

public class Car {

    private String make;

   private String model;

   private double price;
   private String color;

    public Car(String make, String model, double price, String color) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
    }



    void printInfo() {

    System.out.println(make+" "+model+" "+price+" "+color);
}
}
class BMW extends Car {
    public BMW(String make, String model, double price, String color){
        //make a constructor from the parent class
        super(make,model,price,color);

        //with super keyword. This is the constructor to initialize the fields
        //and contains the same amount of fields as parent class.
    }

}


class Audi extends Car{

   boolean sunRoof;

    public Audi(String make, String model, double price, String color){
        super(make,model,price,color);
        this.sunRoof=sunRoof;
    }
}
