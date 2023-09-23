package class25;

import java.util.LinkedList;

public class E6LinkedList {
    public static void main(String[] args) {
        LinkedList<Dog>dogs=new LinkedList<>();
        dogs.add(new Dog("Jacky","Golden"));
        dogs.add(new Dog("Jim","GSD"));
        dogs.add(new Dog("Raiden","Doberman"));

        Dog d=dogs.get(2);
        d.printInfo();
        for(Dog dog:dogs){
            dog.printInfo();
        }
    }
}
class Dog{
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+breed);
    }
}