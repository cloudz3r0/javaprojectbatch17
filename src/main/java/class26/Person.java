package class26;

public class Person {/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

*/
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

void printInfo(){
    System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

}
class P2{
    public static void main(String[] args) {
        Person p=new Person("Adrian","Franco",21,20.0);
        p.printInfo();
    }
}