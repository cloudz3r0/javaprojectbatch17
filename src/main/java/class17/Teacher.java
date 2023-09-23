package class17;

public class Teacher {
   /*
   Write a program called Teacher. Identify features and 4 behaviours
   of that class. Create 3 subclasses MathTeacher, ChemistryTeacher, and PianoTeacher
    */

  static  String name;

   static boolean isNice;

    static boolean isCool;
   static boolean isSmart;
    static boolean isCreative;

   static void talk(){
        System.out.println("Talks");
    }

}
class MathTeacher extends Teacher {
    public static void main(String[] args) {


     name="Mr Myers";


        isNice=true;
isCool=false;
isSmart=true;
isCreative=false;
talk();
    }
}
class PianoTeacher extends Teacher{
    public static void main(String[] args) {
        name="Mr Music";
        isCool=true;
        isSmart=false;
        isCreative=true;
        isNice=true;
    }
}
class ChemistryTeacher extends Teacher{
    public static void main(String[] args) {
        name="Mr Chem";
        isCool=false;
        isSmart=true;
        isCreative=false;
    }
}