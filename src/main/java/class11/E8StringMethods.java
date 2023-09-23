package class11;

public class E8StringMethods {
    public static void main(String[] args) {
        String str="ks d nfjA ZSX232 98 ()4!@#$ %^&A S";
        System.out.println(str.replaceAll("[A-Z]","="));//replaces uppercase
        System.out.println(str.replaceAll("[&-;]",""));//replaces in this ascii range
        System.out.println(str.replaceAll("[A-Z0-9]",""));//
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        //all upper case are replaced. Numbers 0-5 are gone. 8-9 are gone and lowercase a-j are gone.
        System.out.println(str.replaceAll("[ksd2S-]",""));//do a bunch of replacements
//cant put - in between characters because it will create a range.
        System.out.println(str.replaceAll("\\d",""));//regex terms all numbers/digits
        System.out.println(str.replaceAll("\\s",""));//all spaces
        System.out.println(str.replaceAll("[^A-Z]",""));
        //^ in this case it means all that arent in this range will be replaced.
        System.out.println(str.replaceAll("[^A-Za-b0-9]",""));
        //use regex for shortcuts.

    }
}
