package class25;

import java.util.LinkedList;

public class T2Cat {
    private String name;
   private String color;
   private int age;
    public T2Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class T2Test{
    public static void main(String[] args) {
        LinkedList<T2Cat>v=new LinkedList<>();
        v.add(new T2Cat("Nero","Black",12));
        v.add(new T2Cat("Jerry","gray",1));
        v.add(new T2Cat("Ava","White",2));
       v.forEach(x-> x.printInfo());

        }


        }


