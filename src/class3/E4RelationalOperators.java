package class3;

public class E4RelationalOperators {
    public static void main(String[] args) {

        System.out.println(15>10);//will get a boolean true bc 15 is greater than 10
        System.out.println(15>20);//will get a false
        boolean result=100>205;//can also use boolean with numbers to get a true or false
        System.out.println(result);
//performed a relational operation stored them in result variable.
        String a="Aladin";
        String b="Deeplai";
        //System.out.println(a>b);//will get errors trying to do greater than with string values
        System.out.println('A'>'B');// will get false because B is after A. Can use char values
        System.out.println('C'>'B');// will get true since C is after B. In ascii table A=65 B=66
        //ascii table is used for order of many codes. First the alphabet then shows abbreviation values order
    }
}
