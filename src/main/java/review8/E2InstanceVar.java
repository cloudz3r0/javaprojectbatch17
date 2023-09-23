package review8;

public class E2InstanceVar {
    String name = "Jam";

    void printName() {
        System.out.println(name);
    }

    void printInformation() {
        System.out.println(name);//can access anywhere in instances fields.

    }

    static void printInfo() {
        // System.out.println(name); error.
    }


        public static void main (String[]args){
            E2InstanceVar n = new E2InstanceVar();
            n.name = "Hello";
            E2InstanceVar s = new E2InstanceVar();
            s.name = "Hi";
            E2InstanceVar.printInfo();
            s.printInformation();
        }
}


