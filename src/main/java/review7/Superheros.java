package review7;




public class Superheros {

    String name,power;
    int age;
    char gender;
    Superheros(String name, String power){
        this.name=name;
        this.power=power;

    }
    Superheros(String name,String power,int age){
        this(name,power);
        this.age=age;
    }


    public static void main(String[] args) {
        Superheros hero1=new Superheros("Superman","Everything");
       Superheros hero2= new Superheros("Batman","Money",36);

    }
}
