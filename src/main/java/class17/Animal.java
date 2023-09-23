package class17;

public class Animal {
    String name;
    String breed;
    String color;
    int age;//we brought the variables from cat and dog class to here. Parent class

    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age+" ");
    }
}
