package class10;

public class E3StringConvertToLower {
    public static void main(String[] args) {
        String name="ADRIAN";
        System.out.println(name.toLowerCase());
        System.out.println(name);
        name=name.toLowerCase();//reassigning in the name variable
        System.out.println(name);//so it can be lowercase again in here
    }
}
