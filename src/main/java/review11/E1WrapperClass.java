package review11;

public class E1WrapperClass {
    public static void main(String[] args) {
        int a=10;
        //converted the datatype of a into a double in the below statment.
        double b=a;
        System.out.println(b);
        int f=30;
        //converted the datatype of F from its primitive into a wrapper class "Integer".
        Integer g=f;
        System.out.println(g);

        double u=30.5;
        Double t=u;
        //same here. Converting a primitive double into its equivalent wrapper Double.
        System.out.println(u);

        Boolean o=false;
        //now we are auto unboxing. Converting a wrapper into a primitive type here.
        boolean s=o;
        System.out.println(s);

        }
    }

