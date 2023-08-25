package class10;

public class DogTesting {
    //use dog class on right side of screen
    //dog class was the design for this one
    public static void main(String[] args) {
        //creating an object from the dog class using
        //Dog
        Dog cloud0bj=new Dog();
        //assigning a value to name using cloudObj
        cloud0bj.name="Cloud";
        cloud0bj.gender='M';
        cloud0bj.breed="GSD";
        cloud0bj.age=13;
        cloud0bj.weight=80;
        System.out.println(cloud0bj.name);
        System.out.println(cloud0bj.age);
        System.out.println(cloud0bj.breed);
        //we are calling the bark method on cloudObj
        //
        cloud0bj.bark();
        cloud0bj.eat();
        cloud0bj.sleep();

        Dog huskyObj=new Dog();
        huskyObj.name="Castiel";
        huskyObj.gender='M';
        huskyObj.breed="Husky";
        huskyObj.age=7;
        huskyObj.weight=70;
        System.out.println(huskyObj.name);
        System.out.println(huskyObj.gender);
        System.out.println(huskyObj.breed);
        System.out.println(huskyObj.age);
        huskyObj.howl();
        huskyObj.sleep();
        huskyObj.bark();

    }
}
