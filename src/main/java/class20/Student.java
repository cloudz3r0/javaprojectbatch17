package class20;

public class Student {

    void Learn(){
        System.out.println("Learns quickly");
    }
    void Mental(){
        System.out.println("Is happy");
    }
    void School(){
        System.out.println("In building");
    }
}
class CollegeStudent extends Student{
    @Override
    void Learn(){
        System.out.println("Learns modrately");
    }
    @Override
    void Mental(){
        System.out.println("Is sad");
    }

    @Override
    void School() {
        System.out.println("Can be online or in class");
    }
}
class SyntaxStudent extends Student{
    @Override
    void Learn() {
        System.out.println("Learns at a moderate pace");
    }
    @Override
    void Mental() {
        System.out.println("Is okay");
    }
    @Override
    void School() {
        System.out.println("ONLINE");
    }
}