package class20;

public class E4PolyMor {
    public static void main(String[] args) {
     Animal [] arr={new Dog(),new Cat(),new Animal()};
        for (Animal a:arr){
     a.eat();
     a.sleep();
     a.speak();
        }

    }
}
