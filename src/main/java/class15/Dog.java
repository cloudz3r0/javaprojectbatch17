package class15;

public class Dog {
    private String name;
    private String breed;
   private String color;
    private int age;
   public Dog(String dName,String dBreed,String dColor,int dAge){//no written type needed.
        name=dName;//constructors help us give initial values to private values.
        breed=dBreed;
        color=dColor;
        age=dAge;

        }
        public Dog(String dName, String dBreed, String dColor){
            name=dName;
            breed=dBreed;
            color=dColor;
        }

    public void bark(){
        System.out.println("Bark Bark Bark");
    }
   public void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);
    }
}
