package class11;

public class E7StringReplaceAll {
    public static void main(String[] args) {
        String str="ksdnfjAZSX232 ()984!@#$%^&AS";
        System.out.println(str.replaceAll("[A-Z]","="));//65-90. ASCII table
        //the [A-Z] wants to check if whatever is uppercase in this range it will be replaced

        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]",""));//will remove numbers 0-9
        System.out.println(str.replaceAll(" ",""));//remove space
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[&-;]",""));
        //the last one will go through all letters an ascii table
        //so ^ will be removed since its in that range in ascii table.
    }
}
