package class19;

public class Animal {
    private String name;
    private String color;
    private int age;
int num=10;
    public Animal(String name, String color,int age) {
        this.name = name;
        this.color=color;
        this.age=age;

    }

   public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{
//hover over the class then a window will pop up to create constructor
    //matching super.

double weight;
    int num=20;//just redefined the variable in the parent class.
    public Dog(String name, String color, int age,double weight) {
        super(name, color, age);
        this.weight=weight;
    }
    public void printInfo(){
        super.printInfo();//this is to access the method from parent class
        System.out.println(weight);
    }

}
