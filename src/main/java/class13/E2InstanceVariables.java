package class13;

public class E2InstanceVariables {
    String name="Hind";//can be accessed anywhere in this class since its an instance variable.

    void printAge(){
        int age=25;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
    }
    void printCountry(){
       // System.out.println(age); cant access age since its local in printAge
        System.out.println(name);
        System.out.println(country);
        if(10>5){
            System.out.println(country);
        }
    }
    static String country="Uganda";//this can be accessed anywhere in this class
}
