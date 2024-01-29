package class21;

public abstract class Animal {

    String name;
    String breed;
    String color;

    //also making the whole class makes it so nobody can make the object of this class
    //but the object of classes that its a parent to.
    abstract void speak();/*so before we had basic behaviors like animals can speak
       but we dont need the methods/bodies/implementations
    if our child classes have different behaviors.
so if we just want to use different for everything and never call on parent class
    */
 abstract void sleep();


   abstract void eat();

   public void printInfo(){
       System.out.println(name+" "+breed+" "+color);

   }

}

//make class abstract if we dont have implementations of all the parents class methods or constructors

/*abstract*/class Dog extends Animal{

    @Override
    //if we removed one of these methods then we'll get an error bc the parent class
        // is empty.

    void speak(){
        System.out.println("Bark");
    }
    void sleep(){
        System.out.println("Sleeping 10 hours");

    }
    void eat(){
        System.out.println("Eating bones");
    }
}
class Cat extends Animal{
   void eat(){
       System.out.println("Wet food");
   }
    void speak(){
        System.out.println("Meow");
    }
    void sleep(){System.out.println("Cat naps or can sleep up to 12 hours.");
    }

}
