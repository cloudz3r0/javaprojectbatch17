package class10;

public class PhoneSamsung {
    public static void main(String[] args) {
        Phone samsObj=new Phone();
        samsObj.name="S23 Ultra";
        samsObj.brand="Samsung";
        samsObj.storage=32;
        samsObj.price=1000;
        System.out.println(samsObj.name);
        System.out.println(samsObj.brand);
        System.out.println(samsObj.storage);
        System.out.println(samsObj.price);
        samsObj.camera1();
        samsObj.works1();
        samsObj.call1();
        System.out.println("=========");
        Phone pixelObj=new Phone();
        pixelObj.name="Google";
        pixelObj.brand="Pixel 7";
        pixelObj.storage=80;
        pixelObj.price=799;
        System.out.println(pixelObj.name);
        System.out.println(pixelObj.brand);
        System.out.println(pixelObj.storage);
        System.out.println(pixelObj.price);
        pixelObj.camera2();
        pixelObj.works2();
        pixelObj.call1();
    }
}
