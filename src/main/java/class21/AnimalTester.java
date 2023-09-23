package class21;

public class AnimalTester {
    public static void main(String[] args) {
        Animal []arr={new Cat(),new Dog()};
        for(Animal a:arr){
            a.speak();//print out all behaviors for all classes.
            a.eat();
            a.sleep();

        }
    }
}
