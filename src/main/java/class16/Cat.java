package class16;

public class Cat {
    private int age;
    private String name;
    private String color;
    private String breed;
    private double weight;

    private char gender;

    public Cat(int age,String name,String color){
        this.age=age;
        this.name=name;
        this.color=color;
}
    public Cat(int age,String name,String color,double weight,char gender){
        this(age,name,color);//this works because we made a constructor that only takes these values above this one.

        this.gender=gender;
        this.weight=weight;


}
    public Cat(int age,String name,String color,String breed,double weight,char gender){
        this(age,name,color);
        this.breed=breed;
        this.weight=weight;
        this.gender=gender;

    }
    public void printAll(){
        System.out.println(age+" "+name+" "+color+" "+breed+" "+weight+" "+gender);
    }
}
