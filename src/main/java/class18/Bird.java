package class18;

public class Bird {
    /*Create a Bird class create 4 fields and use the
    Bird class as parent class and create 2 classes
    Using it one sparrow and one parrot use constructors make fields private and define printInfo
    methods as well create the object of each class and call the methods
     */

private String name;
private String breed;
private String habitat;
private double weight;

public Bird(String name, String breed, String habitat, double weight){
    this.name=name;
    this.breed=breed;
    this.habitat=habitat;
    this.weight=weight;

}
void printInfo(){
    System.out.println(name+" "+breed+" "+habitat+" "+weight+"lbs");

}
class Sparrow extends Bird{
    public Sparrow(String name, String breed, String habitat, double weight){
        super(name,breed,habitat,weight);

    }
}
class Parrot extends Bird{
    public Parrot(String name,String breed,String habitat,double weight){
        super(name,breed,habitat,weight);
    }
}

    public void main(String[] args) {
        Sparrow c=new Sparrow("Sparrow"," Random","Anywhere",10.3);
  c.printInfo();
Parrot p=new Parrot("Parrot","African Grey","Jungle",8.9);
    }


}
