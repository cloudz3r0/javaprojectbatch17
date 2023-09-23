package review9;



public class Parent {
    String name="James";
    void printHello(){
        System.out.println("Hello world");
    }
    Parent(){
        System.out.println("Parent class constructor.");
    }

Parent(String n){
    System.out.println("Parent class with parameter");
}
}
class Child extends Parent{
    String name="John";
    void printHello(){
        System.out.println("Hello Java");
    }
    void test(){
        String name="White";//this keyword calls to the instance variable of same class.
        //if no instance in same class then it takes instance of parent class since inheritance

        // with no this keyword will go by priority. first local then instance then parents instance
        System.out.println(this.name);
        System.out.println(name);
        System.out.println(super.name);//will get the same name of
        // variable of parent instead of childs variable. Calls to instance of PArent.
    }
    void methodTest(){
        printHello();//calling the same name method in a method will call the nearest method
        //local then instance then parent class.
        super.printHello();//calls directly to parent method.
    }
    public Child(){
super();//calls on constructor in parent class by its parameters.

    }
}