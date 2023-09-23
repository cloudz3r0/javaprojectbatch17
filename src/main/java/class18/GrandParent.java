package class18;

public class GrandParent {
    public GrandParent(){
        System.out.println("Grandpa");
    }
}
class Parent extends GrandParent {
    public Parent() {
        System.out.println("Parents");
    }
}
class Children extends Parent{
    Children(){
        System.out.println("Children");
    }
}
class Tester extends Children{
    public static void main(String[] args) {
        Children c=new Children();
    }
}