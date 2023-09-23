package class16;

public class Person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;

    public  Person(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;

}
    public  Person(String name,int age,double weight,char gender){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;

}
    public  Person(String name,int age,double weight,char gender,int salary,String hairColor){
     this.name=name;
       this.age=age;
        this.weight=weight;
        this.gender=gender;
        this.salary=salary;
        this.hairColor=hairColor;
//this keyword is used for this situation.


    }
    public void printInfo(){
       String name="Ava";
        System.out.println(this.name+" "+age+" "+weight+" "+gender+" "+salary+" "+hairColor);
        //if i didnt use this.name java would use the local variable
        //name that contains Ava instead.
        //"this" is for instance variables.
    }
}
