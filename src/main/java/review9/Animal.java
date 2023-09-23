package review9;

public class Animal {
    void speak(){
        System.out.println("Animals Speak");
    }
void sleep(){
    System.out.println("Animals Sleep");
}
}
class Dog extends Animal{
    void speak(){
        System.out.println("BArk bARK");
    }
    void sleep(){
        System.out.println("Sleeps long");
    }
}