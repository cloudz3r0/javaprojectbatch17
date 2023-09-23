package review8;

public class E1LocalVariables {
    public static void main(String[] args) {
        //System.out.println(country); Java executed top to bottom.
        //this wont work since its above its declaration.

        String country="Uganda";//but in this case this is in the main method block. Until
        //the last bracket. Click on bracket if confused

        {
            int age = 10;
        }
        if (10 > 5) {
            String name = "Wanda";
        }
       // System.out.println(age);cant use age since its in its own block of code.
    }
}
