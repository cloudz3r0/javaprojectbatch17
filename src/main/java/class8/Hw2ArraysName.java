package class8;

public class Hw2ArraysName {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
String []names={"Adrian","Ava","Nero","Cloud"};
        System.out.println(names[0]);
        String[]names2=new String[4];
        names2[0]="Adrian";
        names2[1]="Ava";
        names2[2]="Nero";
        names2[3]="Cloud";
        System.out.println(names2[0]);
    }
}
