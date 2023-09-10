package class10;

public class PhoneIphone {
    public static void main(String[] args) {
        Phone iphoneOBj=new Phone();
        iphoneOBj.name="Iphone";
        iphoneOBj.brand="Apple";
        iphoneOBj.storage=100;
        iphoneOBj.price=100000;
        System.out.println(iphoneOBj.name);
        System.out.println(iphoneOBj.brand);
        System.out.println(iphoneOBj.storage);
        System.out.println(iphoneOBj.price);
        iphoneOBj.works3();
        iphoneOBj.camera3();
        iphoneOBj.call();
    }
}
