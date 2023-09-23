package class12;

public class Hw1Tests {
    public static void main(String[] args) {
        Hw1Methods hw1 = new Hw1Methods();
        System.out.println(hw1.IsPrime(8));

        char res=hw1.grades(90);
        System.out.println(res);
        System.out.println(hw1.grades(90));//another way to print with returns. USE THIS!!
        hw1.lang("france");
    }


}

