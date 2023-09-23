package class13;

public class SyntaxEmployee {
    String empID = "";
    double salary = 0;
    static String CEO= "Sumair";


    public static void main(String[] args) {
        SyntaxEmployee e1 = new SyntaxEmployee();
        e1.empID = "HI1088437";
        e1.salary = 100000;
        System.out.println(e1.empID);
        System.out.println(e1.salary);
        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empID="NO198276";
        e2.salary=80000;
        System.out.println(e2.empID);
        System.out.println(e2.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(e2.CEO);//shows static variables are universal.
        System.out.println(e1.CEO);
    }
}