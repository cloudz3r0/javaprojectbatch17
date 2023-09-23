package class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Nero";//we are able to access name field from animal class
        //then the Cat class that we are using inherited the variables from animal class
        // and now we can access all the fields in a different class with Cats object.
        c.breed="OmCat";
        c.color="White and grey";
        c.age=1;
        c.attitude=true;//this isnt in animal class bc dogs dont have
        //attitude but cats do.
c.printInfo();
        Dog d=new Dog();
        d.bark();//can get this ofc because dog object has been called.
        d.name="Cloud";
        d.breed="GSD";
        d.color="Beige";
        d.age=13;
        d.printInfo();

        Animal a=new Animal();
        a.name="Jim";
        a.color="White";
        a.printInfo();

    }
}
