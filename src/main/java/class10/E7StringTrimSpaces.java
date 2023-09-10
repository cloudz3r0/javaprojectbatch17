package class10;

public class E7StringTrimSpaces {
    public static void main(String[] args) {
        String name = "       USA      ";
        System.out.println(name);
        System.out.println(name.trim());// takes away all spaces before and after the letters.
        //"   US  A    "
        //will only print "US  A"
    }
}