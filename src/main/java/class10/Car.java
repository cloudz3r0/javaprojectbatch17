package class10;

public class Car {
    String name;
    String make;
    int mileage;
    double price;
String seats;
    void speed1(){
        System.out.println("Decent acceleration");}
void speed2(){
    System.out.println("Slow acceleration");}
    void speed3(){
        System.out.println("Fast acceleration");}
void purp1(){System.out.println("Daily car");}
    void purp2(){System.out.println("Family car");}
    void purp3(){System.out.println("Luxury carrrr");}

void features(){System.out.println("Apple play");}


    public static void main(String[] args) {
        Car sedanObj=new Car();
        sedanObj.name="Nissan";
        sedanObj.make="Altima";
        sedanObj.mileage=40;
        sedanObj.price=20000;
        sedanObj.seats="Leather";
        System.out.println(sedanObj.name);
        System.out.println(sedanObj.make);
        System.out.println(sedanObj.mileage);
        System.out.println(sedanObj.price);
        System.out.println(sedanObj.seats);
        sedanObj.speed1();
        sedanObj.purp1();
        sedanObj.features();

        System.out.println("=======");

        Car suvObj=new Car();
        suvObj.name="Lamborghini";
        suvObj.make="SUV";
        suvObj.mileage=30;
        suvObj.price=40000;
        suvObj.seats="Regular";
        System.out.println(suvObj.name);
        System.out.println(suvObj.make);
        System.out.println(suvObj.mileage);
        System.out.println(suvObj.price);
        suvObj.speed2();
        suvObj.purp2();
        suvObj.features();
        System.out.println("=======");
        Car sportObj=new Car();
        sportObj.name="Lamborghini";
        sportObj.make="Huracan";
        sportObj.mileage=50;
        sportObj.price=40000;
        sportObj.seats="Luxurious";
        System.out.println(sportObj.name);
        System.out.println(sportObj.make);
        System.out.println(sportObj.mileage);
        System.out.println(sportObj.price);
        sportObj.speed3();
        sportObj.purp3();
        sportObj.features();



    }






}

