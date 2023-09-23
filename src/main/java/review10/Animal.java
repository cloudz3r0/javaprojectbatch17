package review10;

public abstract class Animal {
   abstract void speak();


    abstract void eat();

    }

class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }

    @Override
    void eat() {
        System.out.println("Dogs eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow");
    }

    @Override
    void eat() {
        System.out.println("Cats eat fish");
    }
}