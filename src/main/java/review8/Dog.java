package review8;

public class Dog {
    String name;
    String color;
    String breed;
    //int sum;
    public void add(int num1,int num2){
        int sum;//dont use instance if you just want to keep a variable local.
        sum=num1+num2;
        System.out.println(sum);
    }
}
class DogTester{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Cloud";
        d.color="Brown";
        d.breed="GSD";
        Dog d2=new Dog();
        d2.name="Raiden";
        d2.color="Black";

    }
}
