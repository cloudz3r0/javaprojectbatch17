package class13;

public class E2InstanceVariablesTester {
    public static void main(String[] args) {

        System.out.println("Line1");
        System.out.println(E2InstanceVariables.country);//able to access country variable thanks to static
        System.out.println();


        E2InstanceVariables e2=new E2InstanceVariables();
        e2.printAge();
    }
}
