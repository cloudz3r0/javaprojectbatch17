package class16;

public class Student {


    /*
    Write a student class. That has instance variables name and address.
    Create a constructor that will initialize those variables. Print with displayINfo() method
     */
    private String name;
    private String address;


    public Student(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public void displayInfo() {
        System.out.println(name + " " + address);
    }

    public static void main(String[] args) {
        Student S = new Student("Adrian", "Dummy Road");
        S.displayInfo();
    }
}
